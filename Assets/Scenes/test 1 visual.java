public class boxScript : MonoBehaviour
{
    Vector3 goUp;
    float speed;
    
    void Start()
    {
        goUp = new Vector3(0.0f,1.0f, 0.0f);
        speed = 2.0f
    }

    void update()
    {
        Ridgedbody rb = this.gameObject.GetComponent<Ridgedbody>();
        rb.velocity = goUp*
    }
}
