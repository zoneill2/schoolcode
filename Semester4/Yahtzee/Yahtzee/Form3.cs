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
    public partial class Form3 : Form
    {
        public Form3()
        {
            InitializeComponent();
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void label16_Click(object sender, EventArgs e)
        {

        }

        private void Form3_Load(object sender, EventArgs e)
        {
            scoreUpdate();
        }

        public void scoreUpdate()
        {
            label1.Text = Yahtzee.theOneString;
            label2.Text = Yahtzee.theTwoString;
            label3.Text = Yahtzee.theThreeString;
            label4.Text = Yahtzee.theFourString;
            label5.Text = Yahtzee.theFiveString;
            label6.Text = Yahtzee.theSixString;
            label7.Text = Yahtzee.dieTotalString;
            label8.Text = Yahtzee.bonusString;
            label9.Text = Yahtzee.upperHalfString;
            label10.Text = Yahtzee.threeKindScoreString;
            label11.Text = Yahtzee.fourKindScoreString;
            label12.Text = Yahtzee.houseScoreString;
            label13.Text = Yahtzee.smStraightString;
            label14.Text = Yahtzee.lgStraightString;
            label15.Text = Yahtzee.yahtzeeScore;
            label16.Text = Yahtzee.chanceString;
            label17.Text = Yahtzee.lowerHalfString;
            label18.Text = Yahtzee.upperHalfString;
            label19.Text = Yahtzee.totalScoreString;
        }
    }
}
