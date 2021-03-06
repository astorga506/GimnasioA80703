/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.gimnasioa80703.dominio;

/**
 *
 * @author Carlos
 */
public class ItemRutinaMedida {
    
    private float valorMedida;
    private MedidaCorporal medidaCorporal;

    public ItemRutinaMedida() {
        medidaCorporal = new MedidaCorporal();
    }

    public ItemRutinaMedida(float valorMedida, MedidaCorporal medidaCorporal) {
        this.valorMedida = valorMedida;
        this.medidaCorporal = medidaCorporal;
    }

    public float getValorMedida() {
        return valorMedida;
    }

    public void setValorMedida(float valorMedida) {
        this.valorMedida = valorMedida;
    }

    public MedidaCorporal getMedidaCorporal() {
        return medidaCorporal;
    }

    public void setMedidaCorporal(MedidaCorporal medidaCorporal) {
        this.medidaCorporal = medidaCorporal;
    }
    
    public String toString(){
        
        return "Valor medida: "+ String.valueOf(valorMedida)+
               "Codigo Medida: "+String.valueOf(medidaCorporal.getCodMedida())+
               "Nombre Medida Medida: "+medidaCorporal.getNombreMedida()+
               "Unidad Medida: "+medidaCorporal.getUnidadMedida() ;
        
    }
    
    
}
