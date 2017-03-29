import javax.xml.bind.JAXBContext
import javax.xml.bind.Marshaller
import javax.xml.bind.Unmarshaller

JAXBContext jc = JAXBContext.newInstance(SampleEntity.class)

Unmarshaller unmarshaller = jc.createUnmarshaller()
File xml = new File(/.\src\main\resources\Sample.xml/)
SampleEntity sample = (SampleEntity) unmarshaller.unmarshal(xml)

Marshaller marshaller = jc.createMarshaller()
marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true)
marshaller.marshal(sample, System.out)
