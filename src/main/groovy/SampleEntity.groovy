import groovy.transform.Immutable
import groovy.transform.ToString

import javax.xml.bind.*
import javax.xml.bind.annotation.*

/**
 * Root Entity for Sample.
 * @author MichEam
 */
@XmlRootElement(name='sample')
@XmlAccessorType(XmlAccessType.NONE)
@ToString(includeNames=true)
class SampleEntity {

	@XmlAttribute String id
	@XmlAttribute String name
	@XmlElement(name='person') Person[] persons = []
}

/**
 * Entity for Person.
 * @author MichEam
 */
@XmlType
@XmlAccessorType(XmlAccessType.NONE)
@ToString(includeNames=true)
class Person {

	@XmlAttribute String id
	@XmlElement int seq
	@XmlElement String name
	@XmlElement String gender
	@XmlElement int age
	@XmlElement Address address
}

/**
 * Entity for Address.
 * @author MichEam
 */
@XmlType
@XmlAccessorType(XmlAccessType.NONE)
@Immutable
@ToString(includeNames=true)
class Address {

	@XmlElement String postcode
	@XmlElement String pref
}
