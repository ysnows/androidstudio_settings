package ${PACKAGE_NAME}.adapter;


import com.ysnows.base.BaseAdapter;
import com.ysnows.base.BaseViewHolder;

import ${PACKAGE_NAME}.R;
import ${PACKAGE_NAME}.model.Hello;


/**
 * Created by ${USER} on ${DATE}.
 */

public class ${NAME}Adapter extends BaseAdapter<${item}, BaseViewHolder> {

    public ${NAME}Adapter() {
        super(R.layout.item_${item_layout});
    }

    @Override
    protected void convert(BaseViewHolder helper, ${item} item) {


    }


}

