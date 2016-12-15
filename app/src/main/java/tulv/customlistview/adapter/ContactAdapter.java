package tulv.customlistview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import tulv.customlistview.R;
import tulv.customlistview.model.Contact;

/**
 * Created by tulv on 12/15/2016.
 */
public class ContactAdapter extends BaseAdapter {

    Context context;
    ArrayList<Contact> arrContact;
    public ContactAdapter(Context context, ArrayList<Contact> arrContact){
        this.context=context;
        this.arrContact=arrContact;
    }
    @Override
    public int getCount() {
        return arrContact.size();
    }

    @Override
    public Object getItem(int i) {
        return arrContact.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view==null){
            view= LayoutInflater.from(context).inflate(R.layout.list_row_item,viewGroup,false);
            viewHolder=new ViewHolder();
            viewHolder.tv_color=(TextView)view.findViewById(R.id.tv_color);
            viewHolder.tv_name=(TextView)view.findViewById(R.id.tv_name);
            viewHolder.tv_phone=(TextView)view.findViewById(R.id.tv_phone);

            view.setTag(viewHolder);
        }else
        {
            viewHolder= (ViewHolder) view.getTag();
        }
        Contact contact=arrContact.get(i);
        viewHolder.tv_name.setText(contact.getmName());
        viewHolder.tv_phone.setText(contact.getmPhone());
        viewHolder.tv_color.setBackgroundColor(contact.getmColor());
        viewHolder.tv_color.setText((i+1)+"");
        return view;
    }

    public class ViewHolder{
        TextView tv_color;
        TextView tv_name;
        TextView tv_phone;
    }
}
