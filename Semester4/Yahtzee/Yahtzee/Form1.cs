using System;
using System.CodeDom;
using System.Collections.Generic;
using System.ComponentModel;
using System.Configuration;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Runtime.ExceptionServices;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Yahtzee.Properties;

namespace Yahtzee
{
    public partial class Yahtzee : Form
    {
        public static int first = 0;
        public static int click = 0;
        public static int nothings = 0;
        public static int totalZeros = 0;
        public static int freq = 0;
        public static int diceCounted = 0;
        public static Boolean canPlay = false;
        public static Boolean addedOne = false;
        public static int randNum;
        public static int[] dice = new int[5];
        public static int[] notAllowed = { 0, 0, 0, 0, 0, 0 };
        public static int theSmall;
        public static int theOne;
        public static string theOneString;
        public static int theTwo;
        public static string theTwoString;
        public static int theThree;
        public static string theThreeString;
        public static int theFour;
        public static string theFourString;
        public static int theFive;
        public static string theFiveString;
        public static int theSix;
        public static string theSixString;
        public int roundScore = 0;
        public static int totalScore = 0;
        public static string totalScoreString;
        public static int yahtzeeNum = 0;
        public static Boolean lgStraightGot = false;
        public static Boolean smStraightGot = false;
        public static Boolean threeKind= false;
        public static Boolean fourKind = false;
        public static Boolean fullHouse = false;
        public static Boolean bonusGot = false;
        public static string yahtzeeScore;
        public static int yahtzeeTotal = 0;
        public static string chanceString;
        public static int chanceScore = 0;
        public static string threeKindScoreString;
        public static int threeKindScore = 0;
        public static string fourKindScoreString;
        public static int fourKindScore = 0;
        public static string houseScoreString;
        public static int houseScore = 0;
        public static string lgStraightString;
        public static int lgStraight = 0;
        public static string smStraightString;
        public static int smStraight = 0;
        public static string lowerHalfString;
        public static int lowerHalf = 0;
        public static string upperHalfString;
        public static int upperHalf = 0;
        public static int dieTotal = 0;
        public static string dieTotalString;
        public static int roundScoreAfter;
        public static int bonus = 0;
        public static string bonusString;
        public static Form3 scoreForm = new Form3();

        public Yahtzee()
        {
            InitializeComponent();
            labelScore.BringToFront();
        }

        private void rollButton_Click(object sender, EventArgs e)
        {
            chanceButton.Enabled = false;
            addedOne = false;
            Random rand = new Random();

            canPlay = true;

            if(click==0)
            {
                chanceButton.Enabled = true;
            }
               


            if (first == 0) {

                nothings = totalScore;

                Console.WriteLine("before" + nothings);
              
                randNum = rand.Next(1, 7);
                dice[0] = randNum;
                label1.Text = "" + randNum;
                setPicture(dice, pictureBox1, 0);

                randNum = rand.Next(1, 7);
                dice[1] = randNum;
                label2.Text = "" + randNum;
                setPicture(dice, pictureBox2, 1);

                randNum = rand.Next(1, 7);
                dice[2] = randNum;
                label3.Text = "" + randNum;
                setPicture(dice, pictureBox3, 2);

                randNum = rand.Next(1, 7);
                dice[3] = randNum;
                label4.Text = "" + randNum;
                setPicture(dice, pictureBox4, 3);

                randNum = rand.Next(1, 7);
                dice[4] = randNum;
                label5.Text = "" + randNum;
                setPicture(dice, pictureBox5, 4);

                checkBox1.Enabled = true;
                checkBox2.Enabled = true;
                checkBox3.Enabled = true;
                checkBox4.Enabled = true;
                checkBox5.Enabled = true;
                endButton.Enabled = true;
            }
            else
            {
                if (checkBox1.Checked == false)
                {
                    randNum = rand.Next(1, 7);
                    dice[0] = randNum;
                    label1.Text = "" + randNum;
                    setPicture(dice, pictureBox1, 0);
                }

                if (checkBox2.Checked == false)
                {
                    randNum = rand.Next(1, 7);
                    dice[1] = randNum;
                    label2.Text = "" + randNum;
                    setPicture(dice, pictureBox2, 1);
                }

                if (checkBox3.Checked == false)
                {
                    randNum = rand.Next(1, 7);
                    dice[2] = randNum;
                    label3.Text = "" + randNum;
                    setPicture(dice, pictureBox3, 2);
                }

                if (checkBox4.Checked == false)
                {
                    randNum = rand.Next(1, 7);
                    dice[3] = randNum;
                    label4.Text = "" + randNum;
                    setPicture(dice, pictureBox4, 3);
                }

                if (checkBox5.Checked == false)
                {
                    randNum = rand.Next(1, 7);
                    dice[4] = randNum;
                    label5.Text = "" + randNum;
                    setPicture(dice, pictureBox5, 4);
                }

            }

            first++;
            turnChecker(first);

        }


        private static void yahtzeeCheck(int[] dice)
        {
            Boolean jackpot = true; 
            int start;           
            start = dice[0];
            for(int i=1;i<dice.Length;i++)
            {
                if(start == dice[i])
                {
                    jackpot = true;
                }
                else
                {
                    jackpot = false;
                    break;
                }
            }
            
            if(jackpot == true)
            {
                if (yahtzeeNum < 1)
                {
                    totalScore = totalScore + 50;
                    yahtzeeTotal += 50;
                    lowerHalf += 50;
                    roundScoreAfter = 1;
                    yahtzeeNum++;
                }
                else
                {
                    totalScore = totalScore + 100;
                    yahtzeeTotal += 100;
                    lowerHalf += 100;
                    roundScoreAfter = 1;
                    yahtzeeNum++;
                }
            }




        }

        private static void straightCheck(int[] dice)
        {
            int find = 0;
            int straight = 0;

            int[] diceCopy = dice.Distinct().ToArray();
            Array.Sort(diceCopy);

            find = diceCopy[0]; 
            for(int i= 1;i<diceCopy.Length;i++) 
            {
                if(diceCopy[i]==(find+1)) 
                {
                    find = diceCopy[i];
                    straight++; 
                }
             
            }     

            if(straight==3 && smStraightGot == false)
            {
                totalScore += 30;
                smStraight += 30;
                lowerHalf += 30;
                roundScoreAfter = 1;
                smStraightGot = true;
            }
            else if(straight == 4 && lgStraightGot == false)
            {
                totalScore += 40;
                lgStraight += 40;
                lowerHalf += 40;
                roundScoreAfter = 1;
                lgStraightGot = true;
            }
            else
            {
                totalScore += 0;
                
            }            

        }


        private void numOfKindCheck(int[] diceCopy)
        {
            int find = 0;
            int kind = 0;
            int num = 0;

            Array.Sort(diceCopy);

            for (int j = 1; j < 7; j++)
            {
                int[] diceCopy2 = Array.FindAll(diceCopy, ele => ele.Equals(j));
                if(diceCopy2.Length==3)
                {
                    kind = 1;
                    num = diceCopy2[0];
                }
                else if(diceCopy2.Length==4)
                {
                    kind = 2;
                    num = diceCopy2[0];
                }
                else if(diceCopy2.Length==2) {
                    find=1;
                }
            }

            num = 0;

            for(int i=0;i<diceCopy.Length;i++)
            {
                num += diceCopy[i];
            }
            //Console.WriteLine("kind" + kind);
            //Console.WriteLine("find" + find);

            if (kind == 1  && find==0 && threeKind == false)
            {
                totalScore += num;
                threeKindScore += num;
                lowerHalf += num;
                roundScoreAfter = 1;
                threeKind = true;
            }
            else if (kind == 2 && fourKind == false)
            {
                totalScore += num;
                fourKindScore += num;
                lowerHalf += num;
                roundScoreAfter = 1;
                fourKind = true;
            }
            else 
            {
                totalScore += 0;
            }

        }

        private void fullHouseCheck(int[] diceCopy)
        {
            int find = 0;
            int kind = 0;
            int num = 0;

            Array.Sort(diceCopy);

            for (int j = 1; j < 7; j++)
            {
                int[] diceCopy2 = Array.FindAll(diceCopy, ele => ele.Equals(j));
                if (diceCopy2.Length == 3)
                {
                    kind = 1;
                    num = diceCopy2[0];      
                }
                else if(diceCopy2.Length == 2)
                {
                    find = 1;
                }
            }

            if (kind == 1 && find == 1 && fullHouse == false)
            {
                totalScore += 25;
                houseScore += 25;
                lowerHalf += 25;
                roundScoreAfter = 1;
                fullHouse = true;
            }
            else
            {
                totalScore += 0;
            }

        }

        private void smallNumCheck(int[] diceCopy)
        {
            int small;

            small = mostFrequent(dice);
            //Console.WriteLine("small:"+small);

            if (validNum(small)==true)
            {
                int[] diceCopy2 = Array.FindAll(diceCopy, ele => ele.Equals(small));
                if (small == 1)
                {
                    theOne += small * (diceCopy2.Length);
                }
                else if (small == 2)
                {
                    theTwo += small * (diceCopy2.Length);
                }
                else if (small == 3)
                {
                    theThree += small * (diceCopy2.Length);
                }
                else if (small == 4)
                {
                    theFour += small * (diceCopy2.Length);
                }
                else if (small == 5)
                {
                    theFive += small * (diceCopy2.Length);
                }
                else
                {
                    theSix += small * (diceCopy2.Length);
                }

                dieTotal += small * (diceCopy2.Length);
                upperHalf+= small * (diceCopy2.Length);

                totalScore += small * (diceCopy2.Length);
                notAllowed[small-1] = small;
                diceCounted++;
            }
            else
            {
                totalScore += 0;
            }

        }

        static int mostFrequent(int[] a)
        {
            int count = 1, tempCount;
            int popular = a[0];
            int temp = 0;
            for (int i = 0; i < (a.Length - 1); i++)
            {
                temp = a[i];
                tempCount = 0;
                for (int j = 1; j < a.Length; j++)
                {
                    if (temp == a[j])
                        tempCount++;
                }
                if (tempCount > count)
                {
                    popular = temp;
                    count = tempCount;
                }
            }

            return popular;
        }

        private bool validNum(int first)
        {

            for(int i=0;i<notAllowed.Length;i++)
            {
                if(notAllowed[i] == first)
                {
                    return false;
                }
            }

            return true;
        }

        private void turnChecker(int first)
        {
            if(first==3)
            {
                rollButton.Enabled = false;
                checkBox1.Enabled = false;
                checkBox2.Enabled = false;
                checkBox3.Enabled = false;
                checkBox4.Enabled = false;
                checkBox5.Enabled = false;
                canPlay = false;
                
            }
        }

        private void setPicture(int[] dice,PictureBox box,int spot)
        {

            
            if(dice[spot] == 1)
            {
                box.Image = Resources.die11;
            }
            else if(dice[spot] == 2)
            {
                box.Image = Resources.die21;
            }
            else if (dice[spot] == 3)
            {
                box.Image = Resources.die31;
            }
            else if (dice[spot] == 4)
            {
                box.Image = Resources.die41;
            }
            else if (dice[spot] == 5)
            {
                box.Image = Resources.die51;
            }
            else if (dice[spot] == 6)
            {
                box.Image = Resources.die61;
            }
           else
            {

            }

         
        }

        private void setPictureRed(int[] dice, PictureBox box, int spot)
        {
            //Console.WriteLine("got here");

            if (dice[spot] == 1)
            {
                box.Image = Resources.diered11;
            }
            else if (dice[spot] == 2)
            {
                box.Image = Resources.diered21;
            }
            else if (dice[spot] == 3)
            {
                box.Image = Resources.diered31;
            }
            else if (dice[spot] == 4)
            {
                box.Image = Resources.diered41;
            }
            else if (dice[spot] == 5)
            {
                box.Image = Resources.diered51;
            }
            else if (dice[spot] == 6)
            {
                box.Image = Resources.diered61;
            }
            else
            {

            }


        }

        private void Form1_Load(object sender, EventArgs e)
        {
            checkBox1.Hide();
            checkBox2.Hide();
            checkBox3.Hide();
            checkBox4.Hide();
            checkBox5.Hide();
            checkBox1.Enabled = false;
            checkBox2.Enabled = false;
            checkBox3.Enabled = false;
            checkBox4.Enabled = false;
            checkBox5.Enabled = false;
            chanceButton.Enabled = false;
            label1.Hide();
            label2.Hide();
            label3.Hide();
            label4.Hide();
            label5.Hide();
            pictureBox1.Image = Resources.die11;
            pictureBox2.Image = Resources.die21;
            pictureBox3.Image = Resources.die31;
            pictureBox4.Image = Resources.die41;
            pictureBox5.Image = Resources.die51;
            endButton.Enabled = false;

        }

        private void endButton_Click(object sender, EventArgs e)
        {
            roundScoreAfter = 0;


            yahtzeeCheck(dice);
            straightCheck(dice);
            fullHouseCheck(dice);
            numOfKindCheck(dice);

            if (roundScoreAfter == 0 && diceCounted < 6)
            {
                smallNumCheck(dice);
            }

            if (upperHalf > 62 && bonusGot == false)
            {
                bonus += 35;
                totalScore += 35;
                upperHalf += bonus;
                bonusGot = true;
            }

            //Console.WriteLine("nothings" + nothings);
            //Console.WriteLine("after" + totalScore);


            if(totalScore == nothings)
            {
                totalZeros++;
            }

            labelScore.Text = "" + totalZeros;


            first = 0;
            checkBox1.Enabled = false;
            checkBox2.Enabled = false;
            checkBox3.Enabled = false;
            checkBox4.Enabled = false;
            checkBox5.Enabled = false;

            checkBox1.Checked = false;
            checkBox2.Checked = false;
            checkBox3.Checked = false;
            checkBox4.Checked = false;
            checkBox5.Checked = false;

            rollButton.Enabled = true;
            label1.Text = "" + 0;
            label2.Text = "" + 0;
            label3.Text = "" + 0;
            label4.Text = "" + 0;
            label5.Text = "" + 0;
            pictureBox1.Image = Resources.die11;
            pictureBox2.Image = Resources.die21;
            pictureBox3.Image = Resources.die31;
            pictureBox4.Image = Resources.die41;
            pictureBox5.Image = Resources.die51;

            yahtzeeScore = yahtzeeTotal.ToString();
            totalScoreString = totalScore.ToString();
            threeKindScoreString = threeKindScore.ToString();
            fourKindScoreString = fourKindScore.ToString();
            houseScoreString = houseScore.ToString();
            lgStraightString = lgStraight.ToString();
            smStraightString = smStraight.ToString();
            lowerHalfString = lowerHalf.ToString();
            theOneString = theOne.ToString();
            theTwoString = theTwo.ToString();
            theThreeString = theThree.ToString();
            theFourString = theFour.ToString();
            theFiveString = theFive.ToString();
            theSixString = theSix.ToString();
            upperHalfString = upperHalf.ToString();
            bonusString = bonus.ToString();
            dieTotalString = dieTotal.ToString();
            chanceString = chanceScore.ToString();

            scoreForm.scoreUpdate();
            scoreForm.Refresh();

            endButton.Enabled = false;
            chanceButton.Enabled = false;

            if(totalZeros>=5)
            {
                labelMessage.Visible = true;
                quitButton.Visible = true;
                retryButton.Visible = true;
                pictureBox1.Visible = false;
                pictureBox2.Visible = false;
                pictureBox3.Visible = false;
                pictureBox4.Visible = false;
                pictureBox5.Visible = false;
                chanceButton.Visible = false;
                endButton.Visible = false;
                rollButton.Visible = false;
                if(totalScore >= 250)
                {
                    labelMessage.Text = "YOU WIN";
                }
                else
                {
                    labelMessage.Text = "YOU LOSE";
                }
                
            }
        }

        private void checkBox2_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void Form1_FormClosing(object sender, FormClosingEventArgs e)
        {
            Application.Exit();
        }

        private void scoreButton_Click(object sender, EventArgs e)
        {
            yahtzeeScore = yahtzeeTotal.ToString();
            totalScoreString = totalScore.ToString();
            threeKindScoreString = threeKindScore.ToString();
            fourKindScoreString = fourKindScore.ToString();
            houseScoreString = houseScore.ToString();
            lgStraightString = lgStraight.ToString();
            smStraightString = smStraight.ToString();
            lowerHalfString = lowerHalf.ToString();
            theOneString = theOne.ToString();
            theTwoString = theTwo.ToString();
            theThreeString = theThree.ToString();
            theFourString = theFour.ToString();
            theFiveString = theFive.ToString();
            theSixString = theSix.ToString();
            upperHalfString = upperHalf.ToString();
            bonusString = bonus.ToString();
            dieTotalString = dieTotal.ToString();
            chanceString = chanceScore.ToString();

            scoreForm = new Form3();
            scoreForm.Show();
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
            if (canPlay == true)
            {
                checkBox1.Checked = !checkBox1.Checked;
                
                if(checkBox1.Checked == true)
                {
                    setPictureRed(dice, pictureBox1, 0);
                }
                else
                {
                    setPicture(dice, pictureBox1, 0);
                }

            }
        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {
            if (canPlay == true)
            {
                checkBox2.Checked = !checkBox2.Checked;


                if (checkBox2.Checked == true)
                {
                    setPictureRed(dice, pictureBox2, 1);
                }
                else
                {
                    setPicture(dice, pictureBox2, 1);
                }
            }
        }

        private void pictureBox3_Click(object sender, EventArgs e)
        {
            if (canPlay == true)
            {
                checkBox3.Checked = !checkBox3.Checked;


                if (checkBox3.Checked == true)
                {
                    setPictureRed(dice, pictureBox3, 2);
                }
                else
                {
                    setPicture(dice, pictureBox3, 2);
                }
            }
        }

        private void pictureBox4_Click(object sender, EventArgs e)
        {
            if (canPlay == true)
            {
                checkBox4.Checked = !checkBox4.Checked;


                if (checkBox4.Checked == true)
                {
                    setPictureRed(dice, pictureBox4, 3);
                }
                else
                {
                    setPicture(dice, pictureBox4, 3);
                }
            }
        }

        private void pictureBox5_Click(object sender, EventArgs e)
        {
            if (canPlay == true)
            {
                checkBox5.Checked = !checkBox5.Checked;


                if (checkBox5.Checked == true)
                {
                    setPictureRed(dice, pictureBox5, 4);
                }
                else
                {
                    setPicture(dice, pictureBox5, 4);
                }
            }
        }

        private void chanceButton_Click(object sender, EventArgs e)
        {
            
                for (int i = 0; i < dice.Length; i++)
                {
                    totalScore += dice[i];
                    chanceScore += dice[i];
                    lowerHalf += dice[i];
                }
            //Console.WriteLine("chance" + chanceScore);

                //labelScore.Text = "" + nothings;


                first = 0;
                checkBox1.Enabled = false;
                checkBox2.Enabled = false;
                checkBox3.Enabled = false;
                checkBox4.Enabled = false;
                checkBox5.Enabled = false;

                checkBox1.Checked = false;
                checkBox2.Checked = false;
                checkBox3.Checked = false;
                checkBox4.Checked = false;
                checkBox5.Checked = false;

                rollButton.Enabled = true;
                label1.Text = "" + 0;
                label2.Text = "" + 0;
                label3.Text = "" + 0;
                label4.Text = "" + 0;
                label5.Text = "" + 0;
                pictureBox1.Image = Resources.die11;
                pictureBox2.Image = Resources.die21;
                pictureBox3.Image = Resources.die31;
                pictureBox4.Image = Resources.die41;
                pictureBox5.Image = Resources.die51;

                yahtzeeScore = yahtzeeTotal.ToString();
                totalScoreString = totalScore.ToString();
                threeKindScoreString = threeKindScore.ToString();
                fourKindScoreString = fourKindScore.ToString();
                houseScoreString = houseScore.ToString();
                lgStraightString = lgStraight.ToString();
                smStraightString = smStraight.ToString();
                lowerHalfString = lowerHalf.ToString();
                chanceString = chanceScore.ToString();
                upperHalfString = upperHalf.ToString();
                bonusString = bonus.ToString();
                dieTotalString = dieTotal.ToString();

                scoreForm.scoreUpdate();
                scoreForm.Refresh();

                endButton.Enabled = false;
                chanceButton.Enabled = false;
                click++;
            

        }

        private void retryButton_Click(object sender, EventArgs e)
        {
            Application.Restart();
        }

        private void quitButton_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

    }
}
