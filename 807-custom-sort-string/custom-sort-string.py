import sys 

class Solution(object):
    def customSortString(self, order, s):
        order_as_list = list(order)
        special_order = dict(zip(order_as_list, range(len(order_as_list))))
        word_to_sort = list(s)
        word_to_sort.sort(key=lambda val: special_order.get(val, sys.maxint))
        return ''.join(word_to_sort)
        