package org.evolveware;

public class Certificate {

    private String CertName;

    public Certificate(String certName) {
        CertName = certName;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "CertName='" + CertName + '\'' +
                '}';
    }
}
