package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comp_spec")
public class Comp {
    @Id
    private Integer id;
    private String gpu;
    private String cpu;
    private String osVersion;
    private Os osType;
    private String motherboard;

    public Comp(){}

    public Comp(Integer id, String gpu, String cpu, String osVersion, Os osType, String motherboard) {
        this.id = id;
        this.gpu = gpu;
        this.cpu = cpu;
        this.osVersion = osVersion;
        this.osType = osType;
        this.motherboard = motherboard;
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

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Column(name = "cpu")
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Column(name = "os_version")
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    @Column(name = "os")
    public Os getOsType() {
        return osType;
    }

    public void setOsType(Os osType) {
        this.osType = osType;
    }

    @Column(name = "mb")
    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }
}
