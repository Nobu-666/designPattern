package dp.memento;

public class RestoreCommand implements AbstractCommand
{
    private UserInfoDTO user;
    
    public RestoreCommand(UserInfoDTO user)
    {
        this.user = user;
    }
    
    @Override
    public void execute(Memento m)
    {
        user.restoreMemento(m);
    }
}
