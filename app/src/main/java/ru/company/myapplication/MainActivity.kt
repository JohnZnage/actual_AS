package ru.company.myapplication

import android.app.Activity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity





class MainActivity : AppCompatActivity() {

    internal var ex1 = arrayOf("Альпинист. 30 сек", "Приседания. 15 раз", "Бег на месте. 30 сек")
    internal var img1 =
        intArrayOf(R.drawable.___________23451___________________1, R.drawable.___________23451_09, R.drawable.___________23451_04)

    internal var ex2 = arrayOf("Отжимания. 10 раз", "Обратные скручивания. 15 раз", "Планка. 30 сек")
    internal var img2 =
        intArrayOf(R.drawable.___________23451_05, R.drawable.___________23451_10, R.drawable.___________23451_02)

    internal var ex3 = arrayOf("Велосипед. 45 сек", "Скручивания. 15 раз", "Растяжка кобра. 45 сек")
    internal var img3 =
        intArrayOf(R.drawable.___________23451_08, R.drawable.___________23451_12, R.drawable.___________23451_07)

    internal var ex4 = arrayOf("Обратные отжимания от стула. 10 раз", "Махи ногами. 30 сек", "Выпады. 20 раз")
    internal var img4 =
        intArrayOf(R.drawable.___________23451_11, R.drawable.___________23451_03, R.drawable.___________23451_06)

    internal var ex5 = arrayOf("Планка. 1 мин", "Скручивания. 20 раз", "Отжимания. 10 раз")
    internal var img5 =
        intArrayOf(R.drawable.___________23451_02, R.drawable.___________23451_12, R.drawable.___________23451_05)

    internal var ex6 = arrayOf("Альпинист. 45 сек", "Планка. 1 мин", "Махи ногами. 1 мин")
    internal var img6 =
        intArrayOf(R.drawable.___________23451___________________1, R.drawable.___________23451_02, R.drawable.___________23451_03)

    internal var ex7 = arrayOf("Бег на месте. 1 мин", "Отжимания. 20 раз", "Выпады. 36 раз")
    internal var img7 =
        intArrayOf(R.drawable.___________23451_04, R.drawable.___________23451_05, R.drawable.___________23451_06)

    internal var ex8 = arrayOf("Растяжка кобра. 1,5 мин", "Велосипед. 1,5 мин", "Приседания. 20 раз")
    internal var img8 =
        intArrayOf(R.drawable.___________23451_07, R.drawable.___________23451_08, R.drawable.___________23451_09)

    internal var ex9 = arrayOf("Обратные скручивания. 25 раз", "Обратные отжимания от стула. 20 раз", "Скручивания. 30 раз")
    internal var img9 =
        intArrayOf(R.drawable.___________23451_10, R.drawable.___________23451_11, R.drawable.___________23451_12)

    internal var ex10 = arrayOf("Махи ногами. 1,5 мин", "Планка. 1,5 мин.", "Отжимания. 25 раз")
    internal var img10 =
        intArrayOf(R.drawable.___________23451_03, R.drawable.___________23451_02, R.drawable.___________23451_05)

    internal var ex11 = arrayOf("Бег на месте. 2 мин", "Альпинист. 1 мин", "Отжимания. 30 раз.")
    internal var img11 =
        intArrayOf(R.drawable.___________23451_04, R.drawable.___________23451___________________1, R.drawable.___________23451_05)

    internal var ex12 = arrayOf("Приседания. 30 раз.", "Бег на месте. 2 мин", "Обратные скручивания. 30 раз")
    internal var img12 =
        intArrayOf(R.drawable.___________23451_09, R.drawable.___________23451_04, R.drawable.___________23451_10)

    internal var ex13 = arrayOf("Велосипед. 2 мин", "Скручивания. 30 раз", "Планка. 2 мин")
    internal var img13 =
        intArrayOf(R.drawable.___________23451_08, R.drawable.___________23451_12, R.drawable.___________23451_02)

    internal var ex14 = arrayOf("Выпады. 40 раз.", "Обратные отжимания от стула. 30 раз", "Растяжка кобра. 2 мин")
    internal var img14 =
        intArrayOf(R.drawable.___________23451_06, R.drawable.___________23451_11, R.drawable.___________23451_07)

    internal var ex15 = arrayOf("Махи ногами. 2 мин", "Отжимания. 35 раз.", "Планка. 2 мин","Растяжка кобра. 2 мин")
    internal var img15 =
        intArrayOf(R.drawable.___________23451_03, R.drawable.___________23451_05, R.drawable.___________23451_02, R.drawable.___________23451_07)

    lateinit var num1:EditText
    lateinit var num2:EditText
    lateinit var res: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.home_0)
        supportActionBar?.title = "Похудей!"
    }

        fun addNumbers(view: View?) {
        num1 = findViewById(R.id.num1)
        num2 = findViewById(R.id.num2)
        res = findViewById(R.id.res)
        val n1 = num1.text.toString().toDouble()
        val n2 = num2.text.toString().toDouble()
        val r = (n1 / (n2*n2))*10000
        res.text = java.lang.Double.toString(r)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            android.R.id.home -> setContentView(R.layout.activity_main)

            R.id.week1 -> {
                setContentView(R.layout.activity_1)


                val spin = findViewById<View>(R.id.spinner) as Spinner
                val customAdapter = CustomAdapter(applicationContext, img1, ex1)
                spin.adapter = customAdapter

                val spin1 = findViewById<View>(R.id.spinner2) as Spinner
                val customAdapter2 = CustomAdapter(applicationContext, img2, ex2)
                spin1.adapter = customAdapter2

                val spin2 = findViewById<View>(R.id.spinner3) as Spinner
                val customAdapter3 = CustomAdapter(applicationContext, img3, ex3)
                spin2.adapter = customAdapter3

                val spin3 = findViewById<View>(R.id.spinner4) as Spinner
                val customAdapter4 = CustomAdapter(applicationContext, img4, ex4)
                spin3.adapter = customAdapter4

                val spin4 = findViewById<View>(R.id.spinner5) as Spinner
                val customAdapter5 = CustomAdapter(applicationContext, img5, ex5)
                spin4.adapter = customAdapter5

            }
            R.id.week2 -> {
                setContentView(R.layout.activity_2)


                val spin = findViewById<View>(R.id.spinner6) as Spinner
                val customAdapter = CustomAdapter(applicationContext, img6, ex6)
                spin.adapter = customAdapter

                val spin1 = findViewById<View>(R.id.spinner7) as Spinner
                val customAdapter2 = CustomAdapter(applicationContext, img7, ex7)
                spin1.adapter = customAdapter2

                val spin2 = findViewById<View>(R.id.spinner8) as Spinner
                val customAdapter3 = CustomAdapter(applicationContext, img8, ex8)
                spin2.adapter = customAdapter3

                val spin3 = findViewById<View>(R.id.spinner9) as Spinner
                val customAdapter4 = CustomAdapter(applicationContext, img9, ex9)
                spin3.adapter = customAdapter4

                val spin4 = findViewById<View>(R.id.spinner10) as Spinner
                val customAdapter5 = CustomAdapter(applicationContext, img10, ex10)
                spin4.adapter = customAdapter5

            }
            R.id.week3 -> {
                setContentView(R.layout.activity_3)


                val spin = findViewById<View>(R.id.spinner11) as Spinner
                val customAdapter = CustomAdapter(applicationContext, img11, ex11)
                spin.adapter = customAdapter

                val spin1 = findViewById<View>(R.id.spinner12) as Spinner
                val customAdapter2 = CustomAdapter(applicationContext, img12, ex12)
                spin1.adapter = customAdapter2

                val spin2 = findViewById<View>(R.id.spinner13) as Spinner
                val customAdapter3 = CustomAdapter(applicationContext, img13, ex13)
                spin2.adapter = customAdapter3

                val spin3 = findViewById<View>(R.id.spinner14) as Spinner
                val customAdapter4 = CustomAdapter(applicationContext, img14, ex14)
                spin3.adapter = customAdapter4

                val spin4 = findViewById<View>(R.id.spinner15) as Spinner
                val customAdapter5 = CustomAdapter(applicationContext, img15, ex15)
                spin4.adapter = customAdapter5

            }
            R.id.close4 -> {
                finish()
            }
        }
        return true
    }
}
