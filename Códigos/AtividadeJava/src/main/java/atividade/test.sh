
echo "Digite um valor positivo:"
read num

sf=1
for i in $(seq 1 $num); do
    sf=$(expr $sf * $(factorial $i))
done

echo "A superfatorial de $num é $sf."