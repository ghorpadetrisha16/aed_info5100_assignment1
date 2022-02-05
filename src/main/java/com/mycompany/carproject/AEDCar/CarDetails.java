package com.mycompany.carproject.AEDCar;

import java.io.*;

/**
 *
 * @author Trisha
 */
public class CarDetails implements Serializable {

private static final long serialVersionUID = -5511291884328004620L;

    private String brand;
    private String model;
    private String color;
    private String year;
    private String EngineNo;
    private String seatsNumber;
    private String licensePlates;
    private String ownerName;
    private String ownerTelephoneNumbers;
    private String ownerEmailAddresses;
    private String ownerDriverlicense;
    private String ownerSocialSecurityNumber;
    private String ownerAddress;
    private String serviceRecords;
    private String warrantyYear;
    private String photo;

    public CarDetails(String brand, String model, String color, String year, String EngineNo, String seatsNumber, String licensePlates, String ownerName, String ownerTelephoneNumbers, String ownerEmailAddresses, String ownerDriverlicense, String ownerSocialSecurityNumber, String ownerAddress, String serviceRecords, String warrantyYear, String photo) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.EngineNo = EngineNo;
        this.seatsNumber = seatsNumber;
        this.licensePlates = licensePlates;
        this.ownerName = ownerName;
        this.ownerTelephoneNumbers = ownerTelephoneNumbers;
        this.ownerEmailAddresses = ownerEmailAddresses;
        this.ownerDriverlicense = ownerDriverlicense;
        this.ownerSocialSecurityNumber = ownerSocialSecurityNumber;
        this.ownerAddress = ownerAddress;
        this.serviceRecords = serviceRecords;
        this.warrantyYear = warrantyYear;
        this.photo = photo;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getYear() {
        return year;
    }

    public String getEngineNo() {
        return EngineNo;
    }

    public String getSeatsNumber() {
        return seatsNumber;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerTelephoneNumbers() {
        return ownerTelephoneNumbers;
    }

    public String getOwnerEmailAddresses() {
        return ownerEmailAddresses;
    }

    public String getOwnerDriverlicense() {
        return ownerDriverlicense;
    }

    public String getOwnerSocialSecurityNumber() {
        return ownerSocialSecurityNumber;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public String getServiceRecords() {
        return serviceRecords;
    }

    public String getWarrantyYear() {
        return warrantyYear;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setEngineNo(String EngineNo) {
        this.EngineNo = EngineNo;
    }

    public void setSeatsNumber(String seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setOwnerTelephoneNumbers(String ownerTelephoneNumbers) {
        this.ownerTelephoneNumbers = ownerTelephoneNumbers;
    }

    public void setOwnerEmailAddresses(String ownerEmailAddresses) {
        this.ownerEmailAddresses = ownerEmailAddresses;
    }

    public void setOwnerDriverlicense(String ownerDriverlicense) {
        this.ownerDriverlicense = ownerDriverlicense;
    }

    public void setOwnerSocialSecurityNumber(String ownerSocialSecurityNumber) {
        this.ownerSocialSecurityNumber = ownerSocialSecurityNumber;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public void setServiceRecords(String serviceRecords) {
        this.serviceRecords = serviceRecords;
    }

    public void setWarrantyYear(String warrantyYear) {
        this.warrantyYear = warrantyYear;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public boolean equals(CarDetails carDetails) {
        return (this.brand.equals(carDetails.brand)
                && this.model.equals(carDetails.model)
                && this.color.equals(carDetails.color)
                && this.year.equals(carDetails.year)
                && this.EngineNo.equals(carDetails.EngineNo)
                && this.seatsNumber.equals(carDetails.seatsNumber)
                && this.licensePlates.equals(carDetails.licensePlates)
                && this.ownerName.equals(carDetails.ownerName)
                && this.ownerTelephoneNumbers.equals(carDetails.ownerTelephoneNumbers)
                && this.ownerEmailAddresses.equals(carDetails.ownerEmailAddresses)
                && this.ownerDriverlicense.equals(carDetails.ownerDriverlicense)
                && this.ownerSocialSecurityNumber.equals(carDetails.ownerSocialSecurityNumber)
                && this.ownerAddress.equals(carDetails.ownerAddress)
                && this.serviceRecords.equals(carDetails.serviceRecords)
                && this.warrantyYear.equals(carDetails.warrantyYear)
                && this.photo.equals(carDetails.photo));
    }
}
