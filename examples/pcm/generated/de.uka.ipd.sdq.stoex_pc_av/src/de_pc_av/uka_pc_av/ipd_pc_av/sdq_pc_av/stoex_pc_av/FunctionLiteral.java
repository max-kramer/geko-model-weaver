/**
 */
package de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.FunctionLiteral#getId <em>Id</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.FunctionLiteral#getParameters_FunctionLiteral <em>Parameters Function Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.Stoex_pc_avPackage#getFunctionLiteral()
 * @model
 * @generated
 */
public interface FunctionLiteral extends Atom {
   /**
    * Returns the value of the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Id</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Id</em>' attribute.
    * @see #setId(String)
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.Stoex_pc_avPackage#getFunctionLiteral_Id()
    * @model required="true" ordered="false"
    * @generated
    */
   String getId();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.FunctionLiteral#getId <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Id</em>' attribute.
    * @see #getId()
    * @generated
    */
   void setId(String value);

   /**
    * Returns the value of the '<em><b>Parameters Function Literal</b></em>' containment reference list.
    * The list contents are of type {@link de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.Expression}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parameters Function Literal</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Parameters Function Literal</em>' containment reference list.
    * @see de_pc_av.uka_pc_av.ipd_pc_av.sdq_pc_av.stoex_pc_av.Stoex_pc_avPackage#getFunctionLiteral_Parameters_FunctionLiteral()
    * @model containment="true" ordered="false"
    * @generated
    */
   EList<Expression> getParameters_FunctionLiteral();

} // FunctionLiteral
