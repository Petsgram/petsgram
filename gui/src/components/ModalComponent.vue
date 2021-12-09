<template>
  <!-- Modal -->
  <div
    class="modal fade"
    id="modal"
    tabindex="-1"
    aria-labelledby="exampleModalLabel"
    aria-hidden="true"
  >
    <div class="vertical-alignment-helper">
      <div class="modal-dialog vertical-align-center">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <h5 class="modal-title" id="exampleModalLabel">
                {{ $props.title }}
              </h5>
              <button
                type="button"
                class="btn-close"
                data-bs-dismiss="modal"
                aria-label="ads"
              ></button>
            </div>
            <div class="modal-body"><slot></slot></div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "ModalComponent",
  props: {
    title: {
      type: String,
      default: "",
    },
  },
  methods: {
    close() {
      this.$emit("close");
    },
  },
};
</script>

<style scoped>
* {
  border: none;
}
.vertical-alignment-helper {
  display: table;
  height: 100%;
  width: 100%;
  pointer-events: none; /* This makes sure that we can still click outside of the modal to close it */
}
.vertical-align-center {
  /* To center vertically */
  display: table-cell;
  vertical-align: middle;
  pointer-events: none;
}
.modal-content {
  /* Bootstrap sets the size of the modal in the modal-dialog class, we need to inherit it */
  width: inherit;
  max-width: inherit; /* For Bootstrap 4 - to avoid the modal window stretching full width */
  height: inherit;
  /* To center horizontally */
  margin: 0 auto;
  pointer-events: all;
}
</style>
