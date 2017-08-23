package ora;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemBean {
    public ItemBean() {
        super();
    }
    
    private String Salutation;
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String PreviousLastName;
    private String NameSuffix;
    private String DisplayName;
    private String PreferredName;
    private String Honors;
    private String CorrespondenceLanguage;
    private String PersonNumber;
    private String WorkPhoneCountryCode;
    private String WorkPhoneAreaCode;
    private String WorkPhoneNumber;
    private String WorkPhoneExtension;
    private String WorkFaxCountryCode;
    private String WorkFaxAreaCode;
    private String WorkFaxNumber;
    private String WorkFaxExtension;
    private String WorkMobilePhoneCountryCode;
    private String WorkMobilePhoneAreaCode;
    private long LegalEntityId;
    private Date HireDate;
    private int NationalId;
    private int NationalIdCountry;
    private Date NationalIdExpirationDate;
    private long PersonId;
    private Date EffectiveStartDate;
    private String DriversLicenseIssuingCountry;
    private int DriversLicenseId;
    private String MilitaryVetStatus;
    private Date CreationDate;
    private Date LastUpdateDate;

    public void setSalutation(String Salutation) {
        this.Salutation = Salutation;
    }
    @JsonProperty("Salutation")
    public String getSalutation() {
        return Salutation;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    @JsonProperty("FirstName")
    public String getFirstName() {
        return FirstName;
    }

    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }
    @JsonProperty("MiddleName")
    public String getMiddleName() {
        return MiddleName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    @JsonProperty("LastName")
    public String getLastName() {
        return LastName;
    }

    public void setPreviousLastName(String PreviousLastName) {
        this.PreviousLastName = PreviousLastName;
    }
    @JsonProperty("PreviousLastName")

    public String getPreviousLastName() {
        return PreviousLastName;
    }

    public void setNameSuffix(String NameSuffix) {
        this.NameSuffix = NameSuffix;
    }
    @JsonProperty("NameSuffix")

    public String getNameSuffix() {
        return NameSuffix;
    }

    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }
    @JsonProperty("DisplayName")
    public String getDisplayName() {
        return DisplayName;
    }

    public void setPreferredName(String PreferredName) {
        this.PreferredName = PreferredName;
    }

    @JsonProperty("PreferredName")
  public String getPreferredName() {
        return PreferredName;
    }

    public void setHonors(String Honors) {
        this.Honors = Honors;
    }
    @JsonProperty("Honors")

    public String getHonors() {
        return Honors;
    }

    public void setCorrespondenceLanguage(String CorrespondenceLanguage) {
        this.CorrespondenceLanguage = CorrespondenceLanguage;
    }
    @JsonProperty("CorrespondenceLanguage")

    public String getCorrespondenceLanguage() {
        return CorrespondenceLanguage;
    }

    public void setPersonNumber(String PersonNumber) {
        this.PersonNumber = PersonNumber;
    }
    @JsonProperty("PersonNumber")

    public String getPersonNumber() {
        return PersonNumber;
    }

    public void setWorkPhoneCountryCode(String WorkPhoneCountryCode) {
        this.WorkPhoneCountryCode = WorkPhoneCountryCode;
    }
    @JsonProperty("WorkPhoneCountryCode")

    public String getWorkPhoneCountryCode() {
        return WorkPhoneCountryCode;
    }

    public void setWorkPhoneAreaCode(String WorkPhoneAreaCode) {
        this.WorkPhoneAreaCode = WorkPhoneAreaCode;
    }
    @JsonProperty("WorkPhoneAreaCode")

    public String getWorkPhoneAreaCode() {
        return WorkPhoneAreaCode;
    }

    public void setWorkPhoneNumber(String WorkPhoneNumber) {
        this.WorkPhoneNumber = WorkPhoneNumber;
    }

    @JsonProperty("WorkPhoneNumber")

    public String getWorkPhoneNumber() {
        return WorkPhoneNumber;
    }

    public void setWorkPhoneExtension(String WorkPhoneExtension) {
        this.WorkPhoneExtension = WorkPhoneExtension;
    }
    @JsonProperty("WorkPhoneExtension")

    public String getWorkPhoneExtension() {
        return WorkPhoneExtension;
    }

    public void setWorkFaxCountryCode(String WorkFaxCountryCode) {
        this.WorkFaxCountryCode = WorkFaxCountryCode;
    }
    @JsonProperty("WorkFaxCountryCode")

    public String getWorkFaxCountryCode() {
        return WorkFaxCountryCode;
    }

    public void setWorkFaxAreaCode(String WorkFaxAreaCode) {
        this.WorkFaxAreaCode = WorkFaxAreaCode;
    }
    @JsonProperty("WorkFaxAreaCode")

    public String getWorkFaxAreaCode() {
        return WorkFaxAreaCode;
    }

    public void setWorkFaxNumber(String WorkFaxNumber) {
        this.WorkFaxNumber = WorkFaxNumber;
    }
    @JsonProperty("WorkFaxNumber")

    public String getWorkFaxNumber() {
        return WorkFaxNumber;
    }

    public void setWorkFaxExtension(String WorkFaxExtension) {
        this.WorkFaxExtension = WorkFaxExtension;
    }
    @JsonProperty("WorkFaxExtension")

    public String getWorkFaxExtension() {
        return WorkFaxExtension;
    }

    public void setWorkMobilePhoneCountryCode(String WorkMobilePhoneCountryCode) {
        this.WorkMobilePhoneCountryCode = WorkMobilePhoneCountryCode;
    }
    @JsonProperty("WorkMobilePhoneCountryCode")

    public String getWorkMobilePhoneCountryCode() {
        return WorkMobilePhoneCountryCode;
    }

    public void setWorkMobilePhoneAreaCode(String WorkMobilePhoneAreaCode) {
        this.WorkMobilePhoneAreaCode = WorkMobilePhoneAreaCode;
    }
    @JsonProperty("WorkMobilePhoneAreaCode")

    public String getWorkMobilePhoneAreaCode() {
        return WorkMobilePhoneAreaCode;
    }

  
  

   

    public void setHireDate(Date HireDate) {
        this.HireDate = HireDate;
    }

    public void setLegalEntityId(long LegalEntityId) {
        this.LegalEntityId = LegalEntityId;
    }
    @JsonProperty("LegalEntityId")
    public long getLegalEntityId() {
        return LegalEntityId;
    }

    @JsonProperty("HireDate")
    public Date getHireDate() {
        return HireDate;
    }

    public void setNationalId(int NationalId) {
        this.NationalId = NationalId;
    }
    
    @JsonProperty("NationalId")
    public int getNationalId() {
        return NationalId;
    }

    public void setNationalIdCountry(int NationalIdCountry) {
        this.NationalIdCountry = NationalIdCountry;
    }

    @JsonProperty("NationalIdCountry")
    public int getNationalIdCountry() {
        return NationalIdCountry;
    }

    public void setNationalIdExpirationDate(Date NationalIdExpirationDate) {
        this.NationalIdExpirationDate = NationalIdExpirationDate;
    }
    
    @JsonProperty("NationalIdExpirationDate")
    public Date getNationalIdExpirationDate() {
        return NationalIdExpirationDate;
    }

    public void setPersonId(long PersonId) {
        this.PersonId = PersonId;
    }

    @JsonProperty("PersonId")
    public long getPersonId() {
        return PersonId;
    }

    public void setEffectiveStartDate(Date EffectiveStartDate) {
        this.EffectiveStartDate = EffectiveStartDate;
    }

    @JsonProperty("EffectiveStartDate")
    public Date getEffectiveStartDate() {
        return EffectiveStartDate;
    }

    public void setDriversLicenseIssuingCountry(String DriversLicenseIssuingCountry) {
        this.DriversLicenseIssuingCountry = DriversLicenseIssuingCountry;
    }

    @JsonProperty("DriversLicenseIssuingCountry")
    public String getDriversLicenseIssuingCountry() {
        return DriversLicenseIssuingCountry;
    }

    public void setDriversLicenseId(int DriversLicenseId) {
        this.DriversLicenseId = DriversLicenseId;
    }
    
    @JsonProperty("DriversLicenseId")
    public int getDriversLicenseId() {
        return DriversLicenseId;
    }

    public void setMilitaryVetStatus(String MilitaryVetStatus) {
        this.MilitaryVetStatus = MilitaryVetStatus;
    }
    @JsonProperty("MilitaryVetStatus")

    public String getMilitaryVetStatus() {
        return MilitaryVetStatus;
    }

    public void setCreationDate(Date CreationDate) {
        this.CreationDate = CreationDate;
    }
    @JsonProperty("CreationDate")

    public Date getCreationDate() {
        return CreationDate;
    }

    public void setLastUpdateDate(Date LastUpdateDate) {
        this.LastUpdateDate = LastUpdateDate;
    }
    @JsonProperty("LastUpdateDate")

    public Date getLastUpdateDate() {
        return LastUpdateDate;
    }
}
