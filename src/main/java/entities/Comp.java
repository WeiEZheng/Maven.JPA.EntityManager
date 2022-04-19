package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "comp")
public class Comp {
    @Id
    private Integer id;
    private String gpu;
    private String cpu_name;
    private String osVersion;
    @Enumerated(EnumType.STRING)
    private Os osType;
    private String mb;

    public Comp(){}

    public Comp(Integer id, String gpu, String cpu_name, String osVersion, Os osType, String mb) {
        this.id = id;
        this.gpu = gpu;
        this.cpu_name = cpu_name;
        this.osVersion = osVersion;
        this.osType = osType;
        this.mb = mb;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "gpu")
    public String getGpu() {
        return gpu;
    }
    @Column(name = "gpu")
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Column(name = "cpu_name")
    public String getCpu_name() {
        return cpu_name;
    }

    public void setCpu_name(String cpu_name) {
        this.cpu_name = cpu_name;
    }

    @Column(name = "os_version")
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    @Column(name = "os")
    public Os getOs() {
        return osType;
    }

    public void setOsType(Os osType) {
        this.osType = osType;
    }

    @Column(name = "mb")
    public String getMb() {
        return mb;
    }

    public void setMb(String motherboard) {
        this.mb = motherboard;
    }
}
