package lu.uni.geko.mapping;

import java.util.Collection;

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.util.bridges.EcoreBridge;
import lu.uni.geko.util.bridges.EcorePkgVariantsBridge;
import lu.uni.geko.util.datastructures.Pair;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * An extension of the extension point {@link UIDCalculatorExt lu.uni.geko.mapping.uidcalculatorext} that implements the
 * calculation of unique identifiers for mappings from pointcut to advice elements based on a name attribute.
 *
 * @see UIDCalculatorExt
 *
 * @author Max E. Kramer
 */
public class NameUIDCalculator implements UIDCalculatorExt {

   @Override
   public Pair<String, Object> calculatePcElementUID(final EObject pcElement, final String currentID) {
      EStructuralFeature pcUIDFeature = pcElement.eClass().getEStructuralFeature(GeKoConstants.getUidFeatureName());
      boolean pcUIDIsNameString = pcUIDFeature != null && EcoreBridge.isStringAttribute(pcUIDFeature);
      String pcElementUID = null;
      if (pcUIDIsNameString) {
         pcElementUID = (String) pcElement.eGet(pcUIDFeature);
      }
      return new Pair<String, Object>(pcElementUID, null);
   }

   @Override
   public Collection<EObject> getPotentiallyCorrespondingAvElements(final Collection<EObject> avElements,
         final EObject pcElement) {
      EClass pcElementClass = pcElement.eClass();
      EClass avElementClass = EcorePkgVariantsBridge.getEClassByReplacingAPkgNsURISuffix(pcElementClass,
            GeKoConstants.getPcMMPkgNsURIAppendage(), GeKoConstants.getAvMMPkgNsURIAppendage());
      return EcoreUtil.getObjectsByType(avElements, avElementClass);
   }

   @Override
   public boolean isCorresponding(final EObject avElement, final String pcElementUID, final Object uIDHelper) {
      String avElementUID = (String) EcoreBridge.getValueForFeatureName(avElement, GeKoConstants.getUidFeatureName());
      return EcoreBridge.equals(pcElementUID, avElementUID);
   }
}
