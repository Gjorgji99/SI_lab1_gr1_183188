class Student {
	String index;
	String firstName;
	String lastName;
    List<Integer> labPoints;

	//TODO constructor
    public Student (String index, String firstName, String lastName)
    {
        this.index=index;
        this.firstName=firstName;
        this.lastName=lastName;
    }
	//TODO seters & getters
    public String getindex(){
        return index;
    }
    public String getfirstName(){
        return fistName;
    }
    public String getfirstName(){
        return lastName;
    }
    public void setindex(String index){
        this.index=index;
    }
    public void setfirstName(String fn);
    {
        fistName=fn;
    }
    public void setlastName(String ln)
    {
    lastName=ln;
    }
    
	public double getAverage() {
		//TODO
		int suma-0;
		for(int i=0;i<labPoints.length;i++)
		suma+=labPoints[i];
		return suma / labPoints.length;
	}

	public boolean hasSignature() {
		//TODO
		if(labPoints.length>8)return true;
		else return false;
	}
}
