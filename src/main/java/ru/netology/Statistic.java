package ru.netology;

public class Statistic {

        public long findMax(long[] incomes){
            long currentMaxIndex = 0;
            long currentMax = incomes[0];
            for (long income : incomes)
                if (currentMax < income)
                    currentMax = income;
            return currentMax;
        }
        public long calculateSum(long[] incomes){
            long sum = 0;
            for (long income : incomes) {
                sum += income;
            }
            return sum;
        }

        public long calculateAverage(long[] incomes){
            long average = calculateSum(incomes) / incomes.length;

            return average;
        }
    }

