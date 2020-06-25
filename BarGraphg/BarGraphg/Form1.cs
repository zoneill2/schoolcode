using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Net.Http.Headers;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Windows.Forms.Design;

namespace BarGraphg
{  

    public partial class Form1 : Form
    {
        public static int total = 0;
        public static List<Customer> cusArray = new List<Customer>();
        public static List<Customer> myAl = new List<Customer>();
        public static List<Customer> myAl2 = new List<Customer>();
        public static List<Customer> SortedAl = new List<Customer>();
        public static List<Customer> SortedAl2 = new List<Customer>();
        public static List<int> myNums = new List<int>();

        public Form1()
        {
            InitializeComponent();
           
            /*
            cusArray.Add(new Customer());
            cusArray.Add(new Customer());
            cusArray.Add(new Customer());
            cusArray.Add(new Customer());
            cusArray.Add(new Customer());
            cusArray.Add(new Customer("Jimmy",5000));
            cusArray.Add(new Customer("Cheese", 8000));


            cusArray[0].Name = "Aaron";
            cusArray[1].Name = "Bill";
            cusArray[2].Name = "Chuck";
            cusArray[3].Name = "Charlie";
            cusArray[4].Name = "Chester";

            cusArray[0].Money = 1000;
            cusArray[1].Money = 3000;
            cusArray[2].Money = 5000;
            cusArray[3].Money = 7000;
            cusArray[4].Money = 9000;
            */

            updateChart();

            
        }

        private void textBox1_KeyPress(object sender, KeyPressEventArgs e)
        {
            if(e.KeyChar == (char)Keys.Enter)
            {
                int num = Int32.Parse(textBox1.Text);
                textBox1.Clear();

                cusArray[0].Money += num;

                textBox2.Clear();

                dataGridView1.DataSource = cusArray;
                dataGridView1.Update();

                textBox3.Focus();

            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            dataGridView1.DataSource = cusArray;
        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {
            myAl.Clear();
            myAl2.Clear();

            string search = textBox2.Text.ToUpper();

            Console.WriteLine(search);

            for (int i = 0; i < cusArray.Count(); i++)
            {
                if (cusArray[i].Name.Length >= search.Length)
                {

                    string theSub = cusArray[i].Name.Substring(0, search.Length).ToUpper();

                    if (search == theSub)
                    {
                        myAl.Add(cusArray[i]);
                    }
                    else
                    {
                        myAl2.Add(cusArray[i]);
                    }
                }  
                else
                {
                    myAl2.Add(cusArray[i]);
                }
            }
         

             SortedAl = myAl.OrderBy(x => x.Name).ToList();
             SortedAl2 = myAl2.OrderBy(x => x.Name).ToList();
             SortedAl.AddRange(SortedAl2);

            cusArray = SortedAl;

            dataGridView1.DataSource = cusArray;
            dataGridView1.Update();

        }

        private void button1_Click(object sender, EventArgs e)
        { 

            if(textBox3.Text != "")
            {
                string newName = textBox3.Text;

                if (textBox4.Text != "")
                {
                    int newMoney = Int32.Parse((textBox4.Text));
                    newName = FirstCharToUpper(newName);
                    cusArray.Add(new Customer(newName,newMoney));
                }
                else
                {
                    label6.Text = "Invalid";
                }
            }
            else
            {
                label6.Text = "Invalid";
            }

            updateChart();

            dataGridView1.DataSource = cusArray;
            dataGridView1.Update();

            textBox3.Clear();
            textBox4.Clear();
            

        }


        public void updateChart()
        {

            cusArray = cusArray.OrderBy(x => x.Name).ToList();

        }

        private void textBox4_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (e.KeyChar == (char)Keys.Enter)
            {
                button1_Click(sender, e);
            }
        }

        public static string FirstCharToUpper(string value)
        {
            char[] array = value.ToCharArray();
            if (array.Length >= 1)
            {
                if (char.IsLower(array[0]))
                {
                    array[0] = char.ToUpper(array[0]);
                }
            }

            for (int i = 1; i < array.Length; i++)
            {
                if (array[i - 1] == ' ')
                {
                    if (char.IsLower(array[i]))
                    {
                        array[i] = char.ToUpper(array[i]);
                    }
                }
            }
            return new string(array);
        }
    }


    public class Customer
    {
        public string name = "default";
        public int money = 0;

        public Customer(string n, int m)
        {
            name = n;
            money = m;
        }

        public Customer()
        {
            name = "default";
            money = 0;
        }

        public string Name
        {
            get { return name; }
            set { name = value; }
        }
        public int Money
        {
            get { return money; }
            set { money = value; }
        }
    }
}
