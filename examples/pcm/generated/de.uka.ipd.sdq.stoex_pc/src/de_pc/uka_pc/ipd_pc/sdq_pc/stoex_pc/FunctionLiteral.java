/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc.FunctionLiteral#getId <em>Id</em>}</li>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc.FunctionLiteral#getParameters_FunctionLiteral <em>Parameters Function Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc.Stoex_pcPackage#getFunctionLiteral()
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
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc.Stoex_pcPackage#getFunctionLiteral_Id()
    * @model required="true" ordered="false"
    * @generated
    */
   String getId();

   /**
    * Sets the value of the '{@link de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc.FunctionLiteral#getId <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Id</em>' attribute.
    * @see #getId()
    * @generated
    */
   void setId(String value);

   /**
    * Returns the value of the '<em><b>Parameters Function Literal</b></em>' containment reference list.
    * The list contents are of type {@link de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc.Expression}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parameters Function Literal</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Parameters Function Literal</em>' containment reference list.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.stoex_pc.Stoex_pcPackage#getFunctionLiteral_Parameters_FunctionLiteral()
    * @model containment="true" ordered="false"
    * @generated
    */
   EList<Expression> getParameters_FunctionLiteral();

} // FunctionLiteral
