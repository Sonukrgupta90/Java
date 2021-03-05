#include<stdio.h>
#include<stdlib.h>
typedef struct nod
{
    int data;
    struct nod *next;
}node;
node *head = NULL, *new_node, *temp, *prev_node, *next_node;
int i, pos;
void create_list(int data)
{
    fflush(stdin);
    new_node = (node *)malloc(sizeof(node));
    new_node->data = data;
    new_node->next = NULL;
    if(head == NULL)
    {
        head = new_node;
        temp = head;
    }
    else
    {
        temp->next = new_node;
        temp = new_node;
    }
}
void display()
{
    temp = head;
    printf("\n--------------Your list--------------\n");
    while(temp != NULL)
    {
        printf("%d ",temp->data);
        temp = temp->next;
    }
    printf("\n---------------XXXXXXX---------------\n");
}
void insert_at_beg()
{
    fflush(stdin);
    new_node = (node *)malloc(sizeof(node));
    printf("\nEnter data: ");
    scanf("%d",&new_node->data);
    new_node->next = head;
    head = new_node;
    printf("Inserted successfully!");
}
void insert_at_end()
{
    fflush(stdin);
    new_node = (node *)malloc(sizeof(node));
    printf("\nEnter data: ");
    scanf("%d",&new_node->data);
    new_node->next = NULL;
    temp = head;
    while(temp->next != NULL)
    {
        temp = temp->next;
    }
    temp->next = new_node;
    printf("Inserted successfully!");
}
void insert_at_pos(int count)
{
    i = 1;
    printf("\nEnter the position: ");
    scanf("%d", &pos);
    if(pos > count)
    {
        printf("Invalid position!");
    }
    else
    {
        temp = head;
        while(i < pos)
        {
            temp = temp->next;
            i++;
        }
        new_node = (node *)malloc(sizeof(node));
        printf("Enter data: ");
        scanf("%d", &new_node->data);
        new_node->next = temp->next;
        temp->next = new_node;
        printf("Inserted successfully!");
    }
}
void del_at_beg()
{
    temp = head;
    head = head->next;
    free(temp);
    printf("Deleted successfully!");
}
void del_at_end()
{
    temp = head;
    while(temp->next != NULL)
    {
        prev_node = temp;
        temp = temp->next;
    }
    if(temp == head)
    {
        head = NULL;
    }
    else
    {
        prev_node->next = NULL;
    }
    free(temp);
    printf("Deleted successfully!");
}
void del_at_pos()
{
    i = 1;
    printf("\nEnter the position: ");
    scanf("%d", &pos);
    temp = head;
    while(i < pos-1)
    {
        temp = temp->next;
        i++;
    }
    next_node = temp->next;
    temp->next = next_node->next;
    free(next_node);
    printf("Deleted successfully!");
}
void reverse_list()
{
    //Take temp as current node
    prev_node = NULL;
    temp = head;
    next_node = head;
    while(next_node != NULL)
    {
        next_node = next_node->next;
        temp->next = prev_node;
        prev_node = temp;
        temp = next_node;
    }
    head = prev_node;
    printf("\nReversed successfully!");
}
int total_nodes()
{
    int count = 0;
    temp = head;
    while(temp != NULL)
    {
        temp = temp->next;
        count++;
    }
    return count;
}
int main()
{
    int choice, num;
    char ch;
    printf("___Creating the list____\n");
    while(1)
    {
        printf("Enter data: ");
        scanf("%d",&num);
        create_list(num);
        printf("Do you want to continue(y/n): ");
        scanf("%c",&ch);
        if(ch == 'n' || ch == 'N')
        {
            printf("____List is created___\n");
            break;
        }
    }
    while(1)
    {
        printf("\n\n1. Display the list\n2. Enter data to the beginning\n");
        printf("3. Enter data to the end\n4. Enter data to the position\n");
        printf("5. Delete data from the beginning\n6. Delete data from the end\n");
        printf("7. Delete data from the position\n8. Reverse the list\n");
        printf("9. Get length of the list\n10. Exit!!!!!\n");
        printf("\nSelect the option: ");
        scanf("%d",&choice);
        if(choice == 10)
            break;
        switch(choice)
        {
            case 1: display();
                    break;
            case 2: insert_at_beg();
                    break;
            case 3: insert_at_end();
                    break;
            case 4: insert_at_pos(total_nodes());
                    break;
            case 5: del_at_beg();
                    break;
            case 6: del_at_end();
                    break;
            case 7: del_at_pos();
                    break;
            case 8: reverse_list();
                    break;
            case 9: printf("\nTotal number of nodes are: %d", total_nodes());
                    break;
            default: printf("\nSelect the proper option!");
        }
    }
    return 0;
}
