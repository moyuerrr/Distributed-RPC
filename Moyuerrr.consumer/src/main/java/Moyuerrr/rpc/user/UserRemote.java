package Moyuerrr.rpc.user;

import java.util.List;

import Moyuerrr.rpc.cousumer.param.Response;


public interface UserRemote {
	public Response saveUser(User user);
	public Response saveUsers(List<User> userlist);
}
