package lu.uni.geko.mapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import lu.uni.geko.common.GeKoBridge;
import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.util.bridges.EcoreBridge;
import lu.uni.geko.util.bridges.EcorePkgVariantsBridge;
import lu.uni.geko.util.datastructures.Pair;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * An extension of the extension point {@link UIDCalculatorExt lu.uni.geko.mapping.uidcalculatorext} that implements the
 * calculation of unique identifiers for mappings from pointcut to advice elements based on all string attributes.
 *
 * @see UIDCalculatorExt
 *
 * @author Max E. Kramer
 */
public class StringAttributesUIDCalculator implements UIDCalculatorExt {

   @Override
   public final Pair<String, Object> calculatePcElementUID(final EObject pcElement, final String currentUID) {
      EClass pcElementClass = pcElement.eClass();
      List<EAttribute> pcStringAttributes = getUIDStringAttributes(pcElementClass);
      String pcElementUID = calculateUIDFromStringAttributes(pcElement, pcStringAttributes);
      return new Pair<String, Object>(pcElementUID, pcStringAttributes);
   }

   /**
    * @param eClass
    *           a metaclass
    * @return a list containing all string attributes of the given metaclass
    */
   private List<EAttribute> getUIDStringAttributes(final EClass eClass) {
      List<EAttribute> stringAttributes = new ArrayList<EAttribute>();
      EList<EAttribute> allEAttributes = eClass.getEAllAttributes();
      for (EAttribute eAttribute : allEAttributes) {
         if (EcoreBridge.isStringAttribute(eAttribute)) {
            stringAttributes.add(eAttribute);
         }
      }
      return stringAttributes;
   }

   /**
    * Calculates a unique identifier for the given pointcut element using the given string attributes.
    *
    * @param pcElement
    *           a pointcut element
    * @param stringAttributes
    *           a list of string attributes of the given pointcut element
    * @return the unique identifier
    */
   private String calculateUIDFromStringAttributes(final EObject pcElement, final List<EAttribute> stringAttributes) {
      StringBuilder uIDValue = new StringBuilder();
      for (EAttribute stringAttribute : stringAttributes) {
         Object attributeValue = pcElement.eGet(stringAttribute);
         // treat pointcut and advice string attributes with the value null the same way we treat the value ""
         if (attributeValue == null) {
            attributeValue = "";
         }
         uIDValue.append("#" + attributeValue);
      }
      if (uIDValue.length() == 0) {
         return null;
      } else {
         return uIDValue.toString();
      }
   }

   @Override
   public final Collection<EObject> getPotentiallyCorrespondingAvElements(final Collection<EObject> avElements,
         final EObject pcElement) {
      EClass pcElementClass = pcElement.eClass();
      EClass avElementClass = EcorePkgVariantsBridge.getEClassByReplacingAPkgNsURISuffix(pcElementClass,
            GeKoConstants.getPcMMPkgNsURIAppendage(), GeKoConstants.getAvMMPkgNsURIAppendage());
      return EcoreUtil.getObjectsByType(avElements, avElementClass);
   }

   @Override
   public final boolean isCorresponding(final EObject avElement, final String pcElementUID, final Object uIDHelper) {
      if (uIDHelper instanceof List<?>) {
         EClass avEClass = avElement.eClass();
         @SuppressWarnings("unchecked")
         List<EAttribute> avStringAttributes = GeKoBridge.getAvAttributesForPcAttributes(avEClass,
               (List<EAttribute>) uIDHelper);
         String avElementUID = calculateUIDFromStringAttributes(avElement, avStringAttributes);
         return pcElementUID.equals(avElementUID);
      } else {
         throw new RuntimeException("The unique identifier helper for the pointcut element with the UID '" + pcElementUID
               + "' and the advice element '" + avElement + "' has to be a List<EAttribute> but was '" + uIDHelper + "'!");
      }
   }
}
