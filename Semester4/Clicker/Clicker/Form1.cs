using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Media;
using Clicker.Properties;

namespace Clicker
{
    public partial class Clicker : Form
    {
        System.Timers.Timer t;
        int s = 0;
        int total = 0;
        int endNum = 0;
        int row = 0;
        int col = 0;
        int choice;
        int time;
        Random rand = new Random();
        SoundPlayer splayer = new SoundPlayer(Resources.bell);
        
        public Clicker()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)  //on button press make invisible and play sound
        {
            splayer.Play();
            button1.Visible = false;
            //randSpot(col, row);
            total++;
           
        }

        private void button2_Click(object sender, EventArgs e)
        {
            choice = trackBar1.Value;       //trackbar decides difficulty, assigned to values
            if(choice==0)
            {
                time = 700;
            }
            else if (choice == 1)
            {
                time = 500;
            }
            else
            {
                time = 350;
            }

            t = new System.Timers.Timer();      //creates new timer
            t.Interval = time;
            t.Elapsed += OnTimeEvent; //adds event method on each second elapsed

            t.Start(); //start timer
            label2.Visible = false;
            label3.Visible = false;
            label4.Visible = false;
            button2.Visible = false;
            trackBar1.Visible = false;
        }

        private void OnTimeEvent(object sender, System.Timers.ElapsedEventArgs e)
        {
            Invoke(new Action(() => //on each second it will add one to s and end num
            {           
                s++;
                endNum++;

                if(s==1)
                {
                    if (endNum == 26) //ends game
                    {
                        label1.Text = total + "/" + (endNum-1);
                        exitButton.Visible = true;
                        retryButton.Visible = true;
                        tableLayoutPanel1.Visible = false;
                        t.Stop();
                    }
                    else
                    {
                        button1.Visible = false; 
                        randSpot(col, row); //calls method to change button location
                        s = 0;
                        label1.Text = total + "/" + (endNum-1);                        
                    }
                
                }
            }));
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            
            button1.BackColor = Color.White;

        }

        public void randSpot(int col, int row) //method assigns random position to button
        {         

            col = rand.Next(0, 6);
            row = rand.Next(0, 5);

            while(tableLayoutPanel1.GetRow(button1)==row)
            {
                row = rand.Next(0, 5);
            }                                                        // these while loops dont allow same spot 2 times in a row

            while (tableLayoutPanel1.GetColumn(button1) == col)
            {
                col = rand.Next(0, 6);
            }
            tableLayoutPanel1.SetRow(button1, row);
            tableLayoutPanel1.SetColumn(button1, col);

            button1.Visible = true;
            t.Start(); //restarts timer
        }

        private void retryButton_Click(object sender, EventArgs e)
        {
            Application.Restart();
        }

        private void exitButton_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }


    }
}
