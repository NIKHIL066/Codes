/**--------------------------------------
    Author: Nikhil Hegde
    Code  : C++ code for selection Sort
----------------------------------------*/
#include<iostream>
using namespace std;

void SelectionSort(int *arr,int length)
{
    int min_index,i,j,temp;

    for(i=0;i<length-2;i++)
    {
        min_index=i;

        for(j=i+1;j<length;j++)
        {
            if(arr[j]<=arr[min_index])
                min_index=j;
        }
        temp=arr[min_index];
        arr[min_index]=arr[i];
        arr[i]=temp;
    }

}

int main()
{
    int arr[20];
    int length;
    int i;
    cout<<"--Selection Sort Code--"<<endl;
    cout<<"Enter the number of elements: ";
    cin>>length;
    cout<<"Enter the "<<length<<" elements in one line with space and \n hit enter at the end "<<endl;

    for(i=0;i<length;i++)
    {
        cin>>arr[i];
    }
    SelectionSort(arr,length);
    cout<<"--Elements  after sorting---"<<endl;
    for(i=0;i<length;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    return 0;
}
