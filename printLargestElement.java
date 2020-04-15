function printLargestElement(x){
  var max = x[0];
  for(var i=0; i<x.length; i++) {
    if (max < x[i])
	{
	max = x[i];
	}
  }
  return max;
}
