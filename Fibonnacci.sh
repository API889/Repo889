echo "How many number of terms to be generated :$1"
function fib
{
  x=0
  y=1
  i=2
  n=$1
  echo "Fibonacci Series up to $n terms :"
  echo "$x"
  echo "$y"
  while [ $i -lt $n ]
  do
      i=`expr $i + 1 `
      z=`expr $x + $y `
      echo "$z"
      x=$y
      y=$z
  done
}
r=`fib $n`
echo "$r"
