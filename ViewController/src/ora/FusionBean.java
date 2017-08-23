package ora;

import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)

public class FusionBean {
    private ArrayList<ItemBean> items;

    public FusionBean() {
        
    }
    public void setItems(ArrayList<ItemBean> items) {
        this.items = items;
    }

    public ArrayList<ItemBean> getItems() {
        return items;
    }
}
