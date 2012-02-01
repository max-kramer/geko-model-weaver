/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Pc2AvMapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Pc2AvMapping.Pc2AvMappingPackage
 * @generated
 */
public interface Pc2AvMappingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Pc2AvMappingFactory eINSTANCE = Pc2AvMapping.impl.Pc2AvMappingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping</em>'.
	 * @generated
	 */
	Mapping createMapping();

	/**
	 * Returns a new object of class '<em>Mapping Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Entry</em>'.
	 * @generated
	 */
	MappingEntry createMappingEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Pc2AvMappingPackage getPc2AvMappingPackage();

} //Pc2AvMappingFactory
