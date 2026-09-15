class Solution:
    def findItinerary(self, tickets: List[List[str]]) -> List[str]:
        # Sort in reverse so we can efficiently pop from the end (O(1))
        adj = collections.defaultdict(list)
        for src, dst in sorted(tickets, reverse=True):
            adj[src].append(dst)

        res = []

        def dfs(src):
            while adj[src]:
                dfs(adj[src].pop())
            res.append(src)  # Append on retreat (Post-order)

        dfs("JFK")
        return res[::-1]  # Reverse to get correct path