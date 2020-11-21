package Hospital;
import General.Date;
import javax.swing.JOptionPane;
public class Demo
{
	public static void main(String[] args)
	{
		int ch,pl=0;
		do
		{
			Doctor doct[]=new Doctor[3];
			doct[0]=new Doctor("saba","surgery","heart","37405-34434223-0","0334-3434431","female");
			doct[1]=new Doctor("fatima","ent","eyes","37340-52143423-6","0374-3453443","female");
			doct[2]=new Doctor("fiza","37405-34232343-4","0355-3774433","female","general","skin");
			Patient p[]=new Patient[6];
			String choice=JOptionPane.showInputDialog("select choice number \n 1-	Add an indoor patient \n 2-	Add an outdoor patient \n 3-	See the list of all Doctors \n 4-	Search a doctor by name or department  \n  5-	See the list of all indoor patients \n 6-	See the list of all appointments on a certain day \n 7-	See the list of appointments of a certain doctor \n 8-	Change the date or time of appointment of a certain patient \n 9-  EXIT");
			ch=Integer.parseInt(choice);
			if(ch==1)
			{
						String pn=JOptionPane.showInputDialog("Enter Patient Name: ");
						String pc=JOptionPane.showInputDialog("Enter Patient CNIC: ");
						String pp=JOptionPane.showInputDialog("Enter Patient Phone:");
						String pg=JOptionPane.showInputDialog("Enter Patient Gender: ");
						String pa=JOptionPane.showInputDialog("Enter Ptient Age: ");
						String padd=JOptionPane.showInputDialog("Enter Patient Address:");
						String pw=JOptionPane.showInputDialog("Enter Patient Ward no: ");
						String pr=JOptionPane.showInputDialog("Enter Patient Room no: ");
						String pb=JOptionPane.showInputDialog("Enter Patient Bed no: ");
						String temp=JOptionPane.showInputDialog("Enter Patient Fee: ");
						Double fee=Double.parseDouble(temp);
						String date=JOptionPane.showInputDialog("Enter date");
						String dpn=JOptionPane.showInputDialog("Enter Doctor ");
						int found=0;
						for(int j=0;j<3&&found==0;j++) 
						{
							if(dpn.compareTo(doct[j].getName())==0)
							{
								p[pl]=new IndoorPatient(pn,padd,pc,pp,pa,pg,pw,pr,pb,fee,doct[j],date);
								pl++;
								found=1;
							}
						}
			}
			else if(ch==2)
			{
				String pn=JOptionPane.showInputDialog("Enter Patient Name: ");
				String pc=JOptionPane.showInputDialog("Enter Patient CNIC: ");
				String pp=JOptionPane.showInputDialog("Enter Patient Phone:");
				String pg=JOptionPane.showInputDialog("Enter Patient Gender: ");
				String pa=JOptionPane.showInputDialog("Enter Ptient Age: ");
				String padd=JOptionPane.showInputDialog("Enter Patient Address:");
				String temp=JOptionPane.showInputDialog("Enter Patient Fee: ");
				Double fee=Double.parseDouble(temp);
				String date=JOptionPane.showInputDialog("Enter date ");
				String time=JOptionPane.showInputDialog("Enter time");
				String dpn=JOptionPane.showInputDialog("Enter Doctor ");
				int found=0;
				for(int j=0;j<3&&found==0;j++) 
				{
					if(dpn.compareTo(doct[j].getName())==0)
					{
						p[pl]=new OutdoorPatient(pn,padd,pc,pp,pa,pg,date,time,doct[j],fee);
						pl++;
						found=1;
					}
				}
				
			}
			
			else  if(ch==3)
			{
				for(int i=0;i<3;i++)
					JOptionPane.showMessageDialog(null,"the doctor is"+doct[i],"doctor",JOptionPane.WARNING_MESSAGE);
			}
			else  if(ch==4)
			{
				int found=0;
				String doctr=JOptionPane.showInputDialog("enter doctor name or department to search");
				for(int j=0;j<3;j++)
				{
					if(doctr.equals(doct[j].getName())||doctr.equals(doct[j].getDepartment()))
					{
						JOptionPane.showMessageDialog(null,"the doctor is"+doct[j],"doctor",JOptionPane.WARNING_MESSAGE);
						found=1;
					}
				}
				if(found==0)
					JOptionPane.showMessageDialog(null,"not found","doctor",JOptionPane.WARNING_MESSAGE);
			}
			else if(ch==5)
			{
				for(int i=0;i<pl;i++)
				{
					 if(p[i] instanceof IndoorPatient )
					  {
						 JOptionPane.showMessageDialog(null,"the indoor patient is"+p[i],"indoor patients",JOptionPane.WARNING_MESSAGE);
					  }	 
				}
			}
			else if(ch==6)
			{
				String dd=JOptionPane.showInputDialog("enter appointment date day to search");
				Date d=new Date(dd);
				for(int i=0;i<pl;i++)
				{
					if(p[i] instanceof OutdoorPatient)
					{
						if(d.getDay()==p[i].getDate().getDay())
							JOptionPane.showMessageDialog(null,"the indoor patient is"+p[i],"indoor patients",JOptionPane.WARNING_MESSAGE);
					}
				}}
			else if(ch==7)
			{
				int found=0;
				String doctr=JOptionPane.showInputDialog("enter doctor name to search");
				for(int i=0;i<pl&&found==0;i++)
				{
					if(p[i] instanceof IndoorPatient)
					{
						if(doctr.equals(p[i].getDoctor().getName()))
						{
							JOptionPane.showMessageDialog(null,"the indoor patient is"+p[i],"indoor patients",JOptionPane.WARNING_MESSAGE);
							found=1;
						}
					}
					else if(p[i] instanceof OutdoorPatient)
					{
						if(doctr.equals(p[i].getDoctor().getName()))
						{
							JOptionPane.showMessageDialog(null,"the outdoor patient is"+p[i],"outdoor patients",JOptionPane.WARNING_MESSAGE);
							found=1;
						}
					}
				}
				if(found==0)
					JOptionPane.showMessageDialog(null,"no patient's appointment with this doctor","indoor patients",JOptionPane.WARNING_MESSAGE);
			}
			else if(ch==8)
			{
				int found=0;
				String ap=JOptionPane.showInputDialog("enter patient name to update appointment");
				for(int j=0;j<pl&&found==0;j++)
				{
					if(p[j]instanceof OutdoorPatient)
					{
						if(ap.equals(p[j].getName()))
						{
							String dd=JOptionPane.showInputDialog("enter appointment date to update");
							Date d=new Date(dd);
							p[j].setDate(d);
						}
					}
				}
				if(found==0)
					JOptionPane.showMessageDialog(null,"no patient's found","indoor patients",JOptionPane.WARNING_MESSAGE);
			}
		}
		while(ch!=9);
	}
}