/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_performance_av_pc.impl;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_performance_av_pc.Qos_performance_av_pcPackage;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_performance_av_pc.SystemSpecifiedExecutionTime;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.qos_performance_av_pc.util.Qos_performance_av_pcValidator;

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
      return Qos_performance_av_pcPackage.Literals.SYSTEM_SPECIFIED_EXECUTION_TIME;
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
                   Qos_performance_av_pcValidator.DIAGNOSTIC_SOURCE,
                   Qos_performance_av_pcValidator.SYSTEM_SPECIFIED_EXECUTION_TIME__SYSTEM_SPECIFIED_EXECUTION_TIME_MUST_REFERENCE_REQUIRED_ROLE_OF_ASYSTEM,
                   EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SystemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem", EObjectValidator.getObjectLabel(this, context) }),
                   new Object [] { this }));
         }
         return false;
      }
      return true;
   }

} //SystemSpecifiedExecutionTimeImpl
