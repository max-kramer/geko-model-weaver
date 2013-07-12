/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forked Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ForkedBehaviour can be considered as a program thread. All parameter characterisations from the surrounding RDSEFF are also valid inside the ForkedBehaviours and can be used to parameterise resource demands or control flow constructs. The parameter characterisations are the same in each ForkedBehaviour.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.ForkedBehaviour#getSynchronisationPoint_ForkedBehaviour <em>Synchronisation Point Forked Behaviour</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.ForkedBehaviour#getForkAction_ForkedBehaivour <em>Fork Action Forked Behaivour</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.Seff_avPackage#getForkedBehaviour()
 * @model
 * @generated
 */
public interface ForkedBehaviour extends ResourceDemandingBehaviour {
   /**
    * Returns the value of the '<em><b>Synchronisation Point Forked Behaviour</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.SynchronisationPoint#getSynchronousForkedBehaviours_SynchronisationPoint <em>Synchronous Forked Behaviours Synchronisation Point</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Synchronisation Point Forked Behaviour</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Synchronisation Point Forked Behaviour</em>' container reference.
    * @see #setSynchronisationPoint_ForkedBehaviour(SynchronisationPoint)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.Seff_avPackage#getForkedBehaviour_SynchronisationPoint_ForkedBehaviour()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.SynchronisationPoint#getSynchronousForkedBehaviours_SynchronisationPoint
    * @model opposite="synchronousForkedBehaviours_SynchronisationPoint" transient="false" ordered="false"
    * @generated
    */
   SynchronisationPoint getSynchronisationPoint_ForkedBehaviour();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.ForkedBehaviour#getSynchronisationPoint_ForkedBehaviour <em>Synchronisation Point Forked Behaviour</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Synchronisation Point Forked Behaviour</em>' container reference.
    * @see #getSynchronisationPoint_ForkedBehaviour()
    * @generated
    */
   void setSynchronisationPoint_ForkedBehaviour(SynchronisationPoint value);

   /**
    * Returns the value of the '<em><b>Fork Action Forked Behaivour</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.ForkAction#getAsynchronousForkedBehaviours_ForkAction <em>Asynchronous Forked Behaviours Fork Action</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Fork Action Forked Behaivour</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Fork Action Forked Behaivour</em>' container reference.
    * @see #setForkAction_ForkedBehaivour(ForkAction)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.Seff_avPackage#getForkedBehaviour_ForkAction_ForkedBehaivour()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.ForkAction#getAsynchronousForkedBehaviours_ForkAction
    * @model opposite="asynchronousForkedBehaviours_ForkAction" transient="false" ordered="false"
    * @generated
    */
   ForkAction getForkAction_ForkedBehaivour();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.ForkedBehaviour#getForkAction_ForkedBehaivour <em>Fork Action Forked Behaivour</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Fork Action Forked Behaivour</em>' container reference.
    * @see #getForkAction_ForkedBehaivour()
    * @generated
    */
   void setForkAction_ForkedBehaivour(ForkAction value);

} // ForkedBehaviour
