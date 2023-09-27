package co.com.futsal.alarma.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import co.com.futsal.alarma.R
import co.com.futsal.alarma.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root
        var valor: Int = 12;
        var minutos: Int = 0;
        var valor1: String = root.findViewById<EditText>(R.id.editTextTime2).text.toString();
        var hora: EditText = root.findViewById<EditText>(R.id.editTextTime2);
        var aumentar: ImageButton = root.findViewById<ImageButton>(R.id.horamas);
        var menos: ImageButton = root.findViewById<ImageButton>(R.id.horamenos);

        var valor2: String = root.findViewById<EditText>(R.id.editTextTime3).text.toString();
        var min: EditText = root.findViewById<EditText>(R.id.editTextTime3);
        var aumentamin: ImageButton = root.findViewById<ImageButton>(R.id.minmas);
        var menosmin: ImageButton = root.findViewById<ImageButton>(R.id.minmenos);

        aumentamin.setOnClickListener {
            minutos++
            if(minutos>59){
                minutos = 0
            }
            valor2 = minutos.toString()
            min.setText( valor2)
        };

        menosmin.setOnClickListener {
            minutos--
            if(minutos<0){
                minutos = 59
            }
            valor2 = minutos.toString()
            min.setText( valor2)
        };


        aumentar.setOnClickListener {
            valor++
            if(valor>23){
                valor = 0
            }
            valor1 = valor.toString()
            hora.setText( valor1)
        };

        menos.setOnClickListener {
            valor--
            if(valor<0){
                valor = 23
            }
            valor1 = valor.toString()
            hora.setText( valor1)
        };

        val textView: TextView = binding.textDashboard
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}