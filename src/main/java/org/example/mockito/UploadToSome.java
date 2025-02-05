package org.example.mockito;

public class UploadToSome {
    private String dataBase;
    private Long systemId;

    public String execute(String inMessage) {
        if (inMessage.length() > 16) {
            upload(dataBase, systemId);
            return dataBase + systemId + " uploaded";
        }
        return " not uploaded";
    }

    protected void upload(String dataBase, Long systemId) {
        System.out.println("do something with " + dataBase + " in " + systemId);
    }

    public void setDataBase(String dataBase) {
        this.dataBase = dataBase;
    }

    public void setSystem(Long system) {
        this.systemId = system;
    }
}
