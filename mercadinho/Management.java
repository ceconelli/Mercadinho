package mercadinho;

import java.util.List;

/**
 *
 * @author gceconelli
 */
public class Management {
    
    private List<Producer> producers;

    public Management(List<Producer> producers) {
        this.producers = producers;
    }
    
    public List getProducers(){
        return this.producers;
    }
    
    public void addProducer(Producer p){
        this.producers.add(p);
    }
    
    public void removeProducer(Producer p){
        if(!this.producers.isEmpty()){
            this.producers.remove(p);
        }
    }
    
    
    
}
