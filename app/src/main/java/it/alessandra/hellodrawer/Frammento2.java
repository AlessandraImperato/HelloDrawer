package it.alessandra.hellodrawer;

import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Frammento2.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Frammento2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Frammento2 extends Fragment {

    public Frammento2() {
    // Required empty public constructor
}

    @Override
    public void onAttach(Activity a) {
        super.onAttach(a);
        log("onAttach");
    }

    private void log(String onAttach) {
    }


    @Override
    public void onCreate(Bundle s) {
        super.onCreate(s);
        log("onCreate");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        log("onCreateView");
        View v = inflater.inflate(R.layout.fragment_frammento2, container, false);
        return v;
    }

    @Override
    public void onActivityCreated(Bundle s) {
        super.onActivityCreated(s);
        log("onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        log("onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        log("onResume");
    }

    @Override
    public void onStop() {
        super.onStop();
        log("onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        log("onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        log("onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        log("onDetach");
    }}
