/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.qos_performance_pc.impl;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.qos_performance_pc.Qos_performance_pcPackage;
import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.qos_performance_pc.SystemSpecifiedExecutionTime;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.qosannotations_pc.qos_performance_pc.util.Qos_performance_pcValidator;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Specified Execution Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SystemSpecifiedExecutionTimeImpl extends SpecifiedExecutionTimeImpl implements SystemSpecifiedExecutionTime {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected SystemSpecifiedExecutionTimeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Qos_performance_pcPackage.Literals.SYSTEM_SPECIFIED_EXECUTION_TIME;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean SystemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem(DiagnosticChain diagnostics, Map<Object, Object> context) {
      // TODO: implement this method
      // -> specify the condition that violates the invariant
      // -> verify the details of the diagnostic, including severity and message
      // Ensure that you remove @generated or mark it @generated NOT
      if (false) {
         if (diagnostics != null) {
            diagnostics.add
               (new BasicDiagnostic
                  (Diagnostic.ERROR,
                   Qos_performance_pcValidator.DIAGNOSTIC_SOURCE,
                   Qos_performance_pcValidator.SYSTEM_SPECIFIED_EXECUTION_TIME__SYSTEM_SPECIFIED_EXECUTION_TIME_MUST_REFERENCE_REQUIRED_ROLE_OF_ASYSTEM,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SystemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem", EObjectValidator.getObjectLabel(this, context) }),
                   new Object [] { this }));
         }
         return false;
      }
      return true;
   }

} //SystemSpecifiedExecutionTimeImpl
