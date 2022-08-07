package ToolKit;

import java.util.Hashtable;

import javax.naming.*;
import javax.naming.directory.*;

public class UserDetails{
		// TODO Auto-generated method stub
	
	      static UserDetails obj = new UserDetails();
	      private UserDetails()
	      {
	    	  
	      }
	      
	      public static UserDetails getInstance()
	      {
	    	  return obj;
	      }
	      
			DirContext context;
			public void ldapConnection(){
				Hashtable<String, String> environment = new Hashtable<String, String>();

		        environment.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		        environment.put(Context.PROVIDER_URL, "ldap://192.168.56.102:389");
		        environment.put(Context.SECURITY_AUTHENTICATION, "simple");
		        environment.put(Context.SECURITY_PRINCIPAL, "Administrator@fortuna.local");
		        environment.put(Context.SECURITY_CREDENTIALS, "Root@2022");

		        try 
		        {
		            context = new InitialDirContext(environment);
		            System.out.println("Connected..");
	//	            System.out.println(context.getEnvironment());
		           
		        } 
		        catch (AuthenticationNotSupportedException exception) 
		        {
		            System.out.println("The authentication is not supported by the server");
	//	            System.out.println(exception.getMessage());
		        }

		        catch (AuthenticationException exception)
		        {
		            System.out.println("Incorrect password or username");
       //                   exception.printStackTrace();
		        }

		        catch (NamingException exception)
		        {
		            System.out.println("Error when trying to create the context");
	//	            exception.printStackTrace();
		        }
		        	
			}
			
			
			
			public void getUser(String username) throws NamingException
			{
				
				
			   
				Attributes attr = context.getAttributes(username.concat(",OU=Calfornia,DC=fortuna,DC=local"));
				System.out.println(attr.get("cn"));
				System.out.println(attr.get("sn"));
				System.out.println(attr.get("countryCode"));
				System.out.println(attr.get("memberOf"));
				
			}
				
			public void UpdateUser(String username,String ctcode) throws NamingException
			{
				String updtname = username.concat(",OU=Calfornia,DC=fortuna,DC=local");
				Attributes attr = context.getAttributes(updtname);
			        System.out.println("Before update..");
				System.out.println(attr.get("cn"));
				System.out.println(attr.get("countryCode"));
				System.out.println(attr.get("memberOf"));
				
				System.out.println("Updating..");
				System.out.println(ctcode);
				ModificationItem[] item = new ModificationItem[1];
				Attribute attr1 = new BasicAttribute("countryCode",ctcode);
				item[0] = new ModificationItem(DirContext.REPLACE_ATTRIBUTE,attr1);
				try
				{
				context.modifyAttributes(updtname,item);
				System.out.println("Update successful..");
				}
				catch (NamingException e)
				{
					e.printStackTrace();
				}
				
				System.out.println("After update ..");
				Attributes attr2 = context.getAttributes(updtname);
				System.out.println(attr2.get("cn"));
				System.out.println(attr2.get("countryCode"));
				System.out.println(attr2.get("memberOf"));
				
			}
			
			public void SearchUser(String email) throws NamingException
			{
				String searchFilter = "(userPrincipalName="+email+")";
				String [] reqAtt = {"cn" , "sn", "countryCode", "objectCategory", "memberOf"};
				SearchControls controls = new SearchControls();
				controls.setSearchScope(SearchControls.SUBTREE_SCOPE);
				controls.setReturningAttributes(reqAtt);
				
				NamingEnumeration users = context.search("OU=Calfornia,DC=fortuna,DC=local",searchFilter,controls);
				
				SearchResult result = null;
				while(users.hasMore()){
					result = (SearchResult) users.next();
					Attributes attr3 = result.getAttributes();
					System.out.println(attr3.get("cn"));
					System.out.println(attr3.get("sn"));
					System.out.println(attr3.get("countryCode"));
					System.out.println(attr3.get("objectCategory"));
					System.out.println(attr3.get("memberOf"));	
				}
				
			}
			
			public void deleteUser(String username)
			{
			   try
			   {
				context.destroySubcontext("CN="+username+",OU=Calfornia,DC=fortuna,DC=local");
				System.out.println("User deleted");
			   }
		       catch(NamingException e)
			   {
		    	   e.printStackTrace();
			   }
			}

			public void changePswd(String username, String password)
			{
				try {
					String dnBase=",OU=People,OU=India Group,DC=fortuna,DC=local";
					ModificationItem[] mods = new ModificationItem[1];
					System.out.println(username + password);
					mods[0] = new ModificationItem(DirContext.REPLACE_ATTRIBUTE, new BasicAttribute("userPassword",password));
					context.modifyAttributes("CN="+username +dnBase, mods);
		//			context.modifyAttributes("CN=Heena,OU=People,OU=IndiaGroup,DC=fortuna,DC=local",mods);
					System.out.println("Password updated");
				}
				catch(Exception e){
					System.out.println("failed"+e.getMessage());
				}
				
			}
			
				
					
		}	