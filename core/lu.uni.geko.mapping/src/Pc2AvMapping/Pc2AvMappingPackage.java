/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Pc2AvMapping;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Pc2AvMapping.Pc2AvMappingFactory
 * @model kind="package"
 * @generated
 */
public interface Pc2AvMappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Pc2AvMapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://lu.uni.geko.pc2avmapping";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Pc2AvMapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Pc2AvMappingPackage eINSTANCE = Pc2AvMapping.impl.Pc2AvMappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link Pc2AvMapping.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Pc2AvMapping.impl.MappingImpl
	 * @see Pc2AvMapping.impl.Pc2AvMappingPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Pc2AvMapping.impl.MappingEntryImpl <em>Mapping Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Pc2AvMapping.impl.MappingEntryImpl
	 * @see Pc2AvMapping.impl.Pc2AvMappingPackageImpl#getMappingEntry()
	 * @generated
	 */
	int MAPPING_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Mapping Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link Pc2AvMapping.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see Pc2AvMapping.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link Pc2AvMapping.Mapping#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see Pc2AvMapping.Mapping#getEntries()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Entries();

	/**
	 * Returns the meta object for class '{@link Pc2AvMapping.MappingEntry <em>Mapping Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Entry</em>'.
	 * @see Pc2AvMapping.MappingEntry
	 * @generated
	 */
	EClass getMappingEntry();

	/**
	 * Returns the meta object for the reference list '{@link Pc2AvMapping.MappingEntry#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see Pc2AvMapping.MappingEntry#getSource()
	 * @see #getMappingEntry()
	 * @generated
	 */
	EReference getMappingEntry_Source();

	/**
	 * Returns the meta object for the reference list '{@link Pc2AvMapping.MappingEntry#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see Pc2AvMapping.MappingEntry#getTarget()
	 * @see #getMappingEntry()
	 * @generated
	 */
	EReference getMappingEntry_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Pc2AvMappingFactory getPc2AvMappingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Pc2AvMapping.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Pc2AvMapping.impl.MappingImpl
		 * @see Pc2AvMapping.impl.Pc2AvMappingPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__ENTRIES = eINSTANCE.getMapping_Entries();

		/**
		 * The meta object literal for the '{@link Pc2AvMapping.impl.MappingEntryImpl <em>Mapping Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Pc2AvMapping.impl.MappingEntryImpl
		 * @see Pc2AvMapping.impl.Pc2AvMappingPackageImpl#getMappingEntry()
		 * @generated
		 */
		EClass MAPPING_ENTRY = eINSTANCE.getMappingEntry();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_ENTRY__SOURCE = eINSTANCE.getMappingEntry_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_ENTRY__TARGET = eINSTANCE.getMappingEntry_Target();

	}

} //Pc2AvMappingPackage
