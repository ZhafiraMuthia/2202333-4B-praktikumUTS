package utsno4;

public class LimasSegiEmpat {
    double luasAlas;
    double luasSelubungLimas;
    double tinggi;
    
    LimasSegiEmpat() {
        luasAlas          = 1;
        luasSelubungLimas = 1;
        tinggi            = 1;
    }
    
    LimasSegiEmpat(double luasAlasBaru, double luasSelubungLimasBaru, double tinggiBaru) {
        luasAlas          = luasAlasBaru;
        luasSelubungLimas = luasSelubungLimasBaru;
        tinggi            = tinggiBaru;
    }

    double getLuas() {
        return luasAlas + luasSelubungLimas;
    }

    double getVolume() {
        return 0.33 * luasAlas * tinggi;
    }

    void setLuasAlas(double luasAlasBaru) {
        luasAlas = luasAlasBaru;
    }

    void setLuasSelubung(double luasSelubungLimasBaru) {
        luasSelubungLimas = luasSelubungLimasBaru;
    }
    
    void setTinggi(double tinggiBaru) {
        tinggi = tinggiBaru;
    }
}
