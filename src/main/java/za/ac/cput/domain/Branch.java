package za.ac.cput.domain;

public class Branch {

        private int branchID;
        private String branchName;
        private String address;
        private String city;
        private String managerName;

        // constructor
        public Branch(int branchID, String branchName, String address, String city, String managerName) {
            this.branchID = branchID;
            this.branchName = branchName;
            this.address = address;
            this.city = city;
            this.managerName = managerName;
        }

    public int getBranchID() {
        return branchID;
    }

    public String getAddress() {
        return address;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getCity() {
        return city;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setBranchID(int branchID) {
        this.branchID = branchID;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchID=" + branchID +
                ", branchName='" + branchName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", managerName='" + managerName + '\'' +
                '}';
    }
}
