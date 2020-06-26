using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Yahtzee
{
    public partial class YahtzeeMenu : Form
    {
        public YahtzeeMenu()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Form gameForm = new Yahtzee();
            gameForm.Show();

            this.Hide();
        }

        private void Form2_Load(object sender, EventArgs e)
        {
            this.BringToFront();
            Form gameForm = new Yahtzee();
        }

            
    }
}
