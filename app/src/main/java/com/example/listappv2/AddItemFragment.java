package com.example.listappv2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AddItemFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AddItemFragment extends Fragment {
    private EditText name, note;
    private Storage storage;

    private Button btnAddItem;

    private Switch switchImportant;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_add_item, container, false);
        name = view.findViewById(R.id.txtAddItem);
        note = view.findViewById(R.id.txtAddNote);
        btnAddItem = view.findViewById(R.id.btnAddItemInfo);
        switchImportant = view.findViewById(R.id.switchImportant);
        storage = Storage.getInstance();
        btnAddItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storage.addItem(new Item(name.getText().toString(), note.getText().toString(), switchImportant.isChecked()));
            }
        });
        return view;
    }


}