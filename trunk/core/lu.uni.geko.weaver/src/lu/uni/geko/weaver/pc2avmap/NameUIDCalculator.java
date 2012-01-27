package lu.uni.geko.weaver.pc2avmap;

import java.util.Collection;

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.util.adapters.EMFAdapter;
import lu.uni.geko.util.datastructures.Pair;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class NameUIDCalculator implements UIDCalculatorExt {

   @Override
   public Pair<String, Object> calculatePcElementUID(EObject pcElement, String currentID) {
      EStructuralFeature pcUIDFeature = pcElement.eClass().getEStructuralFeature(GeKoConstants.getUidFeatureName());
      boolean pcUIDIsNameString = pcUIDFeature != null && EMFAdapter.isStringAttribute(pcUIDFeature);
      String pcElementUID = null;
      if (pcUIDIsNameString) {
         pcElementUID = (String) pcElement.eGet(pcUIDFeature);
      }
      return new Pair<String, Object>(pcElementUID, null);
   }

   @Override
   public Collection<EObject> getPotentiallyCorrespondingAvElements(Collection<EObject> avElements, EObject pcElement) {
      EClass pcElementClass = pcElement.eClass();
      EClass avElementClass = EMFAdapter.getEClassByReplacingAPackageNsURISuffix(pcElementClass,
            GeKoConstants.getPcMMPkgNsURIAppendage(), GeKoConstants.getAvMMPkgNsURIAppendage());
      return EcoreUtil.getObjectsByType(avElements, avElementClass);
   }

   @Override
   public boolean isCorresponding(EObject avElement, EObject pcElement, String pcElementUID, Object uIDHelper) {
      String avElementUID = (String) EMFAdapter.eGetForFeatureName(avElement, GeKoConstants.getUidFeatureName());
      return EMFAdapter.equals(pcElementUID, avElementUID);
   }
}
