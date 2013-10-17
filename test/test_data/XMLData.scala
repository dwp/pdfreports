package test_data

import scala.xml.Elem


object XMLData {



  def functionalTestCase9(xml:Elem) = {
     val fields = XMLDataFields(xml)
     Seq (
       "Transaction: "+fields.transactionPath.text+" "+fields.title.text + " "+fields.surName.text+" "+fields.nationalInsuranceNumber.text,
       "Summary",
       "About you - the carer",
       "National Insurance Number"+fields.nationalInsuranceNumber.text,
       "Last name "+fields.surName.text,
       "First name(s) "+fields.firstName.text,
       "Title "+fields.title.text,
       "Street / Town / City "+fields.addressCarer,
       "Postcode "+fields.postCodeCarer.text,
       "About the care you provide",
       "Last name "+fields.careeLastName.text,
       "First name(s) "+fields.careeFirstName.text,
       "Title "+fields.careeTitle.text,
       "Street / Town / City "+fields.addressCaree,
       "Postcode "+fields.postCodeCaree.text,
       "Claim Dates",
       "Date claim received "+fields.dateClaimReceived.text,
       "Claim Summary",
       "Transaction: "+fields.transactionPath.text+" "+"Claim received: "+fields.dateClaimReceived.text
     )
  }
}