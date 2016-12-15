package tulv.customlistview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import tulv.customlistview.adapter.ContactAdapter;
import tulv.customlistview.model.Contact;

public class MainActivity extends AppCompatActivity {
    ListView lv_Contact;
    ArrayList<Contact> arrContact;
    ContactAdapter contactAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv_Contact = (ListView) findViewById(R.id.lv_contact);
        arrContact = new ArrayList<>();
        arrContact.add(new Contact(Color.BLACK, "A", "098 123 123"));
        arrContact.add(new Contact(Color.BLUE, "B", "098 123 123"));
        arrContact.add(new Contact(Color.GRAY, "C", "098 123 123"));
        arrContact.add(new Contact(Color.GREEN, "D", "098 123 123"));
        arrContact.add(new Contact(Color.RED, "E", "098 123 123"));
        arrContact.add(new Contact(Color.BLACK, "F", "098 123 123"));

        contactAdapter = new ContactAdapter(this, arrContact);
        lv_Contact.setAdapter(contactAdapter);

    }
}
