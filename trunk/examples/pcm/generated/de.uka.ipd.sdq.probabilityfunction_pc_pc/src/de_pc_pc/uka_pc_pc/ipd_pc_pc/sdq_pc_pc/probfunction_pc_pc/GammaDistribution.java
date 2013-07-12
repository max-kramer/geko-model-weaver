/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gamma Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Gamma distribution with shape parameter alpha > 0 (also called k in Wikipedia) and scale parameter theta > 0 (called lambda in umontreal.iro.lecuyer.probdist.GammaDist). The scale parameter theta is the inverse of the rate beta which is also sometimes given to characterise a Gamma distribution. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.GammaDistribution#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.GammaDistribution#getTheta <em>Theta</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.Probfunction_pc_pcPackage#getGammaDistribution()
 * @model
 * @generated
 */
public interface GammaDistribution extends ContinuousPDF {
   /**
    * Returns the value of the '<em><b>Alpha</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * Shape parameter
    * <!-- end-model-doc -->
    * @return the value of the '<em>Alpha</em>' attribute.
    * @see #setAlpha(double)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.Probfunction_pc_pcPackage#getGammaDistribution_Alpha()
    * @model required="true" ordered="false"
    * @generated
    */
   double getAlpha();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.GammaDistribution#getAlpha <em>Alpha</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Alpha</em>' attribute.
    * @see #getAlpha()
    * @generated
    */
   void setAlpha(double value);

   /**
    * Returns the value of the '<em><b>Theta</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * Scale parameter, which is the inverse of the rate parameter beta which is also sometimes given to characterise a Gamma distribution. 
    * <!-- end-model-doc -->
    * @return the value of the '<em>Theta</em>' attribute.
    * @see #setTheta(double)
    * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.Probfunction_pc_pcPackage#getGammaDistribution_Theta()
    * @model required="true" ordered="false"
    * @generated
    */
   double getTheta();

   /**
    * Sets the value of the '{@link de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.probfunction_pc_pc.GammaDistribution#getTheta <em>Theta</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Theta</em>' attribute.
    * @see #getTheta()
    * @generated
    */
   void setTheta(double value);

} // GammaDistribution
