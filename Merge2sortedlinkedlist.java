
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode extra = new ListNode();
        ListNode curr = extra ;
        
        while(list1 != null && list2 != null)
        {
            if(list1.val < list2.val)
            {
                curr.next = list1;
                list1 = list1.next;
            }
            else
            {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        curr.next = list1 != null ? list1 : list2;
        
        return extra.next;
    }
    public void addLast(int value){
        ListNode temp = new ListNode();
        temp.val = value;
        temp.next = null;
    }
}
