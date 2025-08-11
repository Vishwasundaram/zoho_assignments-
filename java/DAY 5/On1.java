/*1. Design a Java program to maintain hospital medical records.
Create a base class named MedicalRecord that includes common attributes:
--- recordId, patientName, dateOfVisit, and diagnosis.
--- inputRecordDetails() – to input common record information.
--- override displayRecord() – to display the common record details.
‌
Create a subclass InPatientRecord that extends MedicalRecord and adds:
--- roomNumber, numberOfDaysAdmitted, roomCharges.
--- calculateTotalCharges() – to compute and return total inpatient cost.
--- displayRecord() – to include all details, including total charges.
‌
Create another subclass OutPatientRecord that extends MedicalRecord and adds:
--- doctorName, consultationFee.
--- override displayRecord() – to include all outpatient-specific details.
Include all the necessary classes if its needed. */
import java.time.LocalDate;
class MedicalRecord{
    int recordId;
    String patientName;
    LocalDate dateOfVisit; 
    String diagnosis;

    public void inputRecordDetails( int recordId,String patientName,LocalDate dateOfVisit,String diagnosis){
        this.recordId= recordId;
        this.patientName= patientName;
        this.dateOfVisit= dateOfVisit; 
        this.diagnosis= diagnosis;
    }

    public void displayRecord(){
        System.out.println("Record ID:"+recordId+"\n"+"Patient Name:"+patientName+"\n"+"Date of Visit:"+dateOfVisit+"\n"+"Diagnosis:"+diagnosis);
    }
}
class InPatientRecord extends MedicalRecord{
    int roomNumber;
    int numberOfDayAd;
    int roomCharges;
    static int total;
    public int calculateTotalCharges(int roomNumber,int numberOfDayAd,int roomCharges) {
        this.roomNumber=roomNumber;
        this.numberOfDayAd=numberOfDayAd;
        this.roomCharges=roomCharges;
        total=roomCharges*numberOfDayAd;
        return total;
    }

    @Override
    public void displayRecord() {
        super.displayRecord();
        System.out.println("Room Number:"+roomNumber+"\n"+"Number of Day Admitted:"+numberOfDayAd+"\n"+"Room Charges:"+roomCharges+"\n"+"Total Fees"+total);
    }
    
}
class OutPatientRecord extends MedicalRecord{
    String doctorName;
    int consulationFee;

    public void valueget(String doctorName,int consulationFee){
        this.doctorName=doctorName;
        this.consulationFee=consulationFee;
    }

    @Override
    public void displayRecord() {
        super.displayRecord();
        System.out.println("Doctor Name:"+doctorName+"\n"+"Consulation Fee:"+consulationFee);
    }  

}

public class On1{
    public static void main(String[] args) {
       
       InPatientRecord  obj1=new InPatientRecord();
      OutPatientRecord obj2=new OutPatientRecord();
      System.out.println("In Patient Record.");
      obj1.inputRecordDetails(1,"Patient1",LocalDate.of(2025, 7, 15),"Fever");
      obj1.calculateTotalCharges(10, 5, 1000);
      obj1.displayRecord();
      System.out.println("----------------------------------");
      System.out.println("In Patient Record.");
      obj1.inputRecordDetails(2,"Patient2",LocalDate.of(2025, 8, 15),"Sugar");
      obj1.calculateTotalCharges(11, 2, 100);
      obj1.displayRecord();
      System.out.println("----------------------------------");
      System.out.println("Out Patient Record.");
       obj2.inputRecordDetails(3,"Patient3",LocalDate.of(2025, 3, 10),"Sugar");
      obj2.valueget("vicky",200);
      obj2.displayRecord();
      System.out.println("----------------------------------");
      System.out.println("Out Patient Record.");
      obj2.inputRecordDetails(4,"Patient4",LocalDate.of(2025, 6, 25),"Fever");
      obj2.valueget("vicky",500);
      obj2.displayRecord();
      System.out.println("----------------------------------");
      
    }
}
/*OUTPUT:
In Patient Record.
Record ID:1
Patient Name:Patient1
Date of Visit:2025-07-15
Diagnosis:Fever
Room Number:10
Number of Day Admitted:5
Room Charges:1000
Total Fees5000
----------------------------------
In Patient Record.
Record ID:2
Patient Name:Patient2
Date of Visit:2025-08-15
Diagnosis:Sugar
Room Number:11
Number of Day Admitted:2
Room Charges:100
Total Fees200
----------------------------------
Out Patient Record.
Record ID:3
Patient Name:Patient3
Date of Visit:2025-03-10
Diagnosis:Sugar
Doctor Name:vicky
Consulation Fee:200
----------------------------------
Out Patient Record.
Record ID:4
Patient Name:Patient4
Date of Visit:2025-06-25
Diagnosis:Fever
Doctor Name:vicky
Consulation Fee:500
----------------------------------*/