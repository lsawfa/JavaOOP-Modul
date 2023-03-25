package Kegiatan1;

public class dinasPertanahan {
    private String[] alamat=new String[3];
    private int[] panjangTanah, luasTanah=new int[3];
    private int i;
    private int a;
    private int x;
    private int j=-1;
    private int b=-1;
    private int y=-1;
    public String getAlamat () {
        j++;
        return alamat[j];
    }
    public void setAlamat(String alamat){
        this.alamat[i] = alamat;
        i++;
    }
    public int getPanjangTanah() {
        y++;
        return panjangTanah[y];
    }
    public void setPanjangTanah(int panjangTanah){
        this.panjangTanah[x] = panjangTanah;
        x++;
    }
    public int getLuasTanah() {
        b++;
        return luasTanah[b];
    }
    public void setLuasTanah(int luasTanah){
        this.luasTanah[a] = luasTanah;
        a++;
    }
}