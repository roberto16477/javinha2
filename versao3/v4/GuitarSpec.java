public class GuitarSpec extends InstrumentSpec{
    private int numStrings;

    public GuitarSpec(Builder builder,
 String model, Type type, int numStrings, Wood backWood, Wood topWood)
{
 super(builder, model, type, backWood, topWood);
 this.numStrings = numStrings;
 }

 public int getNumStrings(){
 return numStrings;
 }

 public boolean matches(InstrumentSpec otherSpec){
 if (!super.matches(otherSpec))
 return false;
 if (!(otherSpec instanceof GuitarSpec))
 return false;
 GuitarSpec spec = (GuitarSpec)otherSpec;
 if (numStrings != spec.numStrings)
 return false;
 return true;

 }


    public Builder getBuilder(){
    return builder;
    }

    public String getModel(){
    return model;
    }

    public Type getType(){
    return type;
    }

    public int getNumStrings(){
        return numStrings;
    }

    public Wood getBackWood(){
    return backWood;
    }

    public Wood getTopWood(){
    return topWood;
    }

}
